import React, { useState } from 'react';
import axios from 'axios';

function BankDelete() {
  const [bankId, setBankId] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    axios.delete(`http://localhost:2137/bank/${bankId}`)
      .then((response) => {
        console.log(response.data);
        alert('Bank został usunięty');
      })
      .catch((error) => {
        console.log(error);
        alert('Wystąpił błąd');
      });
  };

  return (
    <div>
      <h2>Usuń bank</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Identyfikator banku:
          <input type="text" value={bankId} onChange={(event) => setBankId(event.target.value)} />
        </label>
        <button type="submit">Usuń</button>
      </form>
    </div>
  );
}

export default BankDelete;
