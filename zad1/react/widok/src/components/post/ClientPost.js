import React, { useState } from 'react';
import axios from 'axios';

function ClientPost() {
  const [bank_id, setBankId] = useState('');
  const [person_id, setPersonId] = useState('');


  const handleSubmit = (event) => {
    event.preventDefault();
    axios.post('http://localhost:2137/client', {
      bank_id: bank_id,
      person_id: person_id,
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
        Bank ID:
        <input type="text" value={bank_id} onChange={e => setBankId(e.target.value)} />
      </label>
      <label>
        Person ID:
        <input type="text" value={person_id} onChange={e => setPersonId(e.target.value)} />
      </label>
      <button type="submit">Add Person</button>
    </form>
  );
}

export default ClientPost;
