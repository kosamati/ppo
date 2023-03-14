import React from 'react';
import Account from './components/get/Account';
import Person from './components/get/Person';
import ClientView from './components/get/Client';
import Bank from './components/get/Bank'
import PersonList from './components/get/PersonList'

import PersonPost from "./components/post/PersonPost";
import BankPost from "./components/post/Bankpost";

function App() {
  return (
    <div className="App">
      <ClientView clientId="1" />
    </div>
  );
}

export default App;
