import React from 'react';
import {
    BrowserRouter as Router,
    Switch,
    Route
} from "react-router-dom";
import Admin from "./admin/Admin";
import Order from "./order/Order";
import Delivery from "./delivery/Delivery";

function App() {
    return (
        <Router>
            <Switch>
                <Route path="/delivery"><Delivery/></Route>
                <Route path="/admin"><Admin/></Route>
                <Route path="/"><Order/></Route>
            </Switch>
        </Router>
    );
}

export default App;
