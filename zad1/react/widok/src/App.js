import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

import Account from './components/get/Account';
import Person from './components/get/Person';
import ClientView from './components/get/Client';
import Bank from './components/get/Bank';
import PersonList from './components/get/PersonList';

import PersonPost from "./components/post/PersonPost";
import BankPost from "./components/post/Bankpost";
import ClientPost from './components/post/ClientPost';
import AccountPost from './components/post/AccountPost';

import DeletePerson from './components/delete/PersonDelete';
import DeleteAccount from './components/delete/DeleteAccount';
import BankDelete from './components/delete/DeleteBank';
import DeleteClient from './components/delete/DeleteClinet';

import UpdateAccount from './components/Update/UpdateAccount';
import UpdateBank from './components/Update/UpdateBank';
import UpdateClient from './components/Update/UpdateClient';
import UpdatePerson from './components/Update/UpdatePerson';

function App() {
  return (
    <Router>
      <div className="App">
        <Switch>
          <Route exact path="/personlist" component={PersonList} />

          <Route path="/account/:accountId" component={Account} />
          <Route path="/person/:personId" component={Person} />
          <Route path="/client/:clientId" component={ClientView} />
          <Route path="/bank/:bankId" component={Bank} />
          
          <Route path="/create-person" component={PersonPost} />
          <Route path="/create-bank" component={BankPost} />
          <Route path="/create-client" component={ClientPost} />
          <Route path="/create-account" component={AccountPost} />

          <Route path="/delete-person/" component={DeletePerson} />
          <Route path="/delete-account/" component={DeleteAccount} />
          <Route path="/delete-bank/" component={BankDelete} />
          <Route path="/delete-client/" component={DeleteClient} />

          <Route path="/update-account/:accountId" component={UpdateAccount} />
          <Route path="/update-bank/:bankId" component={UpdateBank} />
          <Route path="/update-client/" component={UpdateClient} />
          <Route path="/update-person/" component={UpdatePerson} />
        </Switch>
      </div>
    </Router>
  );
}

export default App;
