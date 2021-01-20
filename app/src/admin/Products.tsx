import React from "react";
import {BrowserRouter as Router, Redirect, Route, Switch, useRouteMatch} from "react-router-dom";
import ProductsList from "./ProductsList";
import NewProduct from "./NewProduct";

function Products() {

    const match = useRouteMatch();

    return (
        <Router>
            <Switch>
                <Route path={`${match.path}/new`}><NewProduct/></Route>
                <Route path={match.path}><ProductsList/></Route>
            </Switch>
        </Router>
    )
}

export default Products