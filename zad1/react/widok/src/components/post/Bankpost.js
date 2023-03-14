import React, { useState } from 'react';
import axios from 'axios';

function BankPost() {
  const [bankName, setBankName] = useState('')
  const [bankAddress, setbankAddress] = useState('')

  const handleSubmit = (event) => {
    event.preventDefault();
    axios.post('http://localhost:2137/bank', {
      bank_name: bankName,
      bank_address: bankAddress
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
        Bank Name:
        <input type="text" value={bankName} onChange={e => setBankName(e.target.value)} />
      </label>
      <label>
        Bank Address:
        <input type="text" value={bankAddress} onChange={e => setbankAddress(e.target.value)} />
      </label>
      <button type="submit">Add Bank</button>
    </form>
  );
}

export default BankPost;
