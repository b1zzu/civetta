import {Button, Card, CardActions, CardContent, Fab, makeStyles, Typography} from "@material-ui/core";
import {Add as AddIcon} from "@material-ui/icons";
import React from "react";
import {useHistory, useRouteMatch} from "react-router-dom";

function ProductsList() {

    const classes = makeStyles((theme) => ({
        fab: {
            position: "absolute",
            bottom: theme.spacing(2),
            right: theme.spacing(2),
        }
    }))()

    const history = useHistory()
    const match = useRouteMatch();

    return (
        <React.Fragment>
            <Card>
                <CardContent>
                    <Typography variant={"h5"} component={"h2"}>
                        Word of the Day
                    </Typography>
                </CardContent>
                <CardActions>
                    <Button size={"small"}>edit</Button>
                </CardActions>
            </Card>
            <Fab
                className={classes.fab}
                color={"primary"}
                onClick={() => history.push(`${match.path}/new`)}>
                <AddIcon/>
            </Fab>
        </React.Fragment>
    )
}

export default ProductsList