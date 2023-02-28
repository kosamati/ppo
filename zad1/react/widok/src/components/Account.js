import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Account({ accountId }) {
  const [account, setAccount] = useState(null);
    
  useEffect(() => {
    axios.get(`http://localhost:2137/account/${accountId}`)
      .then(response => {
        setAccount(response.data);
        
      })
      .catch(error => {
        console.log(error);
      });
  }, [accountId]);

  if (!account) {
    return <div>Loading...</div>;
  }

  return (
    
    <div>
        <h1>Account id: {account[0].account_id}</h1>
        <p>account type: {account[0].account_type}</p>
        <p>balance: {account[0].balance}</p>
    </div>
  );
}

export default Account;