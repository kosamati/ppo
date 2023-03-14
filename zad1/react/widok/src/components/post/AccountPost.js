import React, { useState } from 'react';
import axios from 'axios';

function BankPost() {
  const [account_number, setaccount_number] = useState('')
  const [account_type, setaccount_type] = useState('')
  const [balance, setBalance] = useState('')
  const [person_id, setperson_id] = useState('')

  const handleSubmit = (event) => {
    event.preventDefault();
    axios.post('http://localhost:2137/account', {
      account_number: account_number,
      account_type: account_type,
      balance: balance,
      person_id: person_id
    })
    .then(response => {
      console.log(response);
    })
    .catch(error => {
      console.log(error);
    });
  }

  return (
    <form onSubmit={handleSubmit}>
      <label>
      account_number:
        <input type="text" value={account_number} onChange={e => setaccount_number(e.target.value)} />
      </label>
      <label>
      account_type:
        <input type="text" value={account_type} onChange={e => setaccount_type(e.target.value)} />
      </label>
      <label>
      balance:
        <input type="text" value={balance} onChange={e => setBalance(e.target.value)} />
      </label>
      <label>
      person_id:
        <input type="text" value={person_id} onChange={e => setperson_id(e.target.value)} />
      </label>
      <button type="submit">Add Account</button>
    </form>
  );
}

export default BankPost;
