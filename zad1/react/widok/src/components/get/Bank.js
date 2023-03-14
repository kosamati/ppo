import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Bank({BankID}) {
  const [bank, setBank] = useState(null);

  useEffect(() => {
    axios.get(`http://localhost:2137/bank/${BankID}`)
    .then(response => {
        setBank(response.data[0]);
      })
  }, [BankID]);

  if (!bank) {
    return <p>Loading...</p>;
  }

  return (
    <div>
      <h2>{bank.bank_name}</h2>
      <p>{bank.bank_address}</p>
    </div>
  );
}

export default Bank;
