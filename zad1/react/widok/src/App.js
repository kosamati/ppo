import React from 'react';
// read
import Account from './components/get/Account';
import Person from './components/get/Person';
import ClientView from './components/get/Client';
import Bank from './components/get/Bank'
import PersonList from './components/get/PersonList'

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
    <div className="App">
      <Account accountId="2"/>
    </div>
  );
}

export default App;
