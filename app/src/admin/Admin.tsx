import {
    AppBar,
    Box,
    Container,
    Drawer,
    IconButton,
    List,
    ListItem,
    ListItemIcon,
    ListItemText,
    makeStyles,
    Toolbar,
    Typography
} from "@material-ui/core";
import React, {useState} from "react";
import {Inbox as InboxIcon, Menu as MenuIcon} from "@material-ui/icons";
import {BrowserRouter as Router, Redirect, Route, Switch, useRouteMatch} from "react-router-dom";
import Products from "./Products";

function Admin() {

    const classes = makeStyles((theme) => ({
        menuButton: {
            marginRight: theme.spacing(2)
        }
    }))()

    const match = useRouteMatch();

    const [drawer, setDrawer] = useState(false)

    return (
        <React.Fragment>
            <AppBar>
                <Toolbar>
                    <IconButton color={"inherit"} edge={"start"} className={classes.menuButton}
                                onClick={() => setDrawer(true)}>
                        <MenuIcon/>
                    </IconButton>
                    <Typography>
                        Products
                    </Typography>
                </Toolbar>
            </AppBar>
            <Drawer open={drawer} onClose={() => setDrawer(false)}>
                <List>
                    <ListItem>
                        <ListItemIcon><InboxIcon/></ListItemIcon>
                        <ListItemText>Hello</ListItemText>
                    </ListItem>
                </List>
                stuff here
            </Drawer>
            <Toolbar/>
            <Container>
                <Box my={2}>
                    <Router>
                        <Switch>
                            <Route path={`${match.path}/products`}><Products/></Route>
                            <Route path={match.path}><Redirect to={`${match.path}/products`}/></Route>
                        </Switch>
                    </Router>
                </Box>
            </Container>
        </React.Fragment>
    );
}

export default Admin;