import React, { useState } from 'react';
import axios from 'axios';

function UpdateBank(props) {
  const [bankName, setBankName] = useState('');
  const [bankAddress, setBankAddress] = useState('');

  const handleBankNameChange = (event) => {
    setBankName(event.target.value);
  };

  const handleBankAddressChange = (event) => {
    setBankAddress(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    axios.put(`http://localhost:2137/bank/${props.bankId}`, { bank_name: bankName, bank_address: bankAddress })
      .then((response) => {
        alert(response.data);
      })
      .catch((error) => {
        console.error(error);
      });
  };

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label htmlFor="bankName">Nazwa banku:</label>
        <input type="text" id="bankName" value={bankName} onChange={handleBankNameChange} />
      </div>
      <div>
        <label htmlFor="bankAddress">Adres banku:</label>
        <input type="text" id="bankAddress" value={bankAddress} onChange={handleBankAddressChange} />
      </div>
      <button type="submit">Zapisz zmiany</button>
    </form>
  );
}

export default UpdateBank;
