import {Button, Card, CardActions, CardContent, CardHeader, IconButton, makeStyles, TextField} from "@material-ui/core";
import {Close as CancelIcon} from "@material-ui/icons";
import React, {useState} from "react";
import {useHistory} from "react-router-dom";
import {gql, useMutation} from '@apollo/client';

const CREATE_PRODUCT = gql`
  mutation CreateProduct(
    $name: String!, 
    $description: String!,
    $image: String!,
    $price: Float!) {
      createProduct(
        name: $name, 
        description: $description,
        image: $image,
        price: $price) {
          id
          name
          description
          image
          price
      }
  }
`;

function NewProduct() {

    const classes = makeStyles((theme) => ({
        field: {
            marginBottom: theme.spacing(2)
        },
        content: {
            marginBottom: -theme.spacing(1)
        },
        save: {
            marginLeft: "auto",
            marginRight: theme.spacing(2)
        }
    }))()

    const history = useHistory()
    const [createProduct] = useMutation(CREATE_PRODUCT)

    const [name, setName] = useState("")
    const [description, setDescription] = useState("")
    const [price, setPrice] = useState("")

    return (
        <Card>
            <form onSubmit={(e) => {
                createProduct({
                    variables: {
                        name: name,
                        description: description,
                        image: "",
                        price: price
                    }
                })
                e.preventDefault()
            }}>
                <CardHeader
                    action={
                        <IconButton
                            color={"inherit"}
                            onClick={() => history.goBack()}>
                            <CancelIcon/>
                        </IconButton>
                    }
                    title={"New Product"}
                />
                <CardContent className={classes.content}>
                    <TextField
                        label="Name"
                        className={classes.field}
                        fullWidth={true}
                        value={name}
                        onChange={(e) => setName(e.target.value)}/>
                    <TextField
                        label="Description"
                        className={classes.field}
                        multiline={true}
                        rows={3}
                        fullWidth={true}
                        value={description}
                        onChange={(e) => setDescription(e.target.value)}/>
                    <TextField
                        label="Price"
                        className={classes.field}
                        fullWidth={true}
                        type={"number"}
                        value={price}
                        onChange={(e) => setPrice(e.target.value)}/>
                </CardContent>
                <CardActions>
                    <Button
                        className={classes.save}
                        type={"submit"}>
                        save
                    </Button>
                </CardActions>
            </form>
        </Card>
    )
}

export default NewProduct