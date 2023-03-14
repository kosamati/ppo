import React, { useState } from 'react';
import axios from 'axios';

function UpdateAccount(props) {
  const [balance, setBalance] = useState(null);
  const [message, setMessage] = useState(null);

  function handleSubmit(event) {
    event.preventDefault();
    axios.put(`http://localhost:2137/account/${props.accountId}`, { balance })
      .then(response => {
        setMessage(response.data);
      })
      .catch(error => {
        console.error(error);
      });
  }

  function handleBalanceChange(event) {
    setBalance(event.target.value);
  }

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <label>
          New balance:
          <input type="number" value={balance} onChange={handleBalanceChange} />
        </label>
        <button type="submit">Update Account</button>
      </form>
      {message && <p>{message}</p>}
    </div>
  );
}

export default UpdateAccount;