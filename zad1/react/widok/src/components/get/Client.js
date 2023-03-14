import React, { useState, useEffect } from 'react';
import axios from 'axios';

function ClientView(props) {
  const [client, setClient] = useState(null);

  useEffect(() => {
    axios.get(`http://localhost:2137/client/${props.clientId}`)
      .then(response => {
        setClient(response.data[0]);
      })
      .catch(error => {
        console.error(error);
      });
  }, [props.clientId]);

  if (!client) {
    return <p>Loading...</p>;
  }

  return (
    <div>
      <h2>Client ID {client.client_id}</h2>
      <p>Bank: {client.bank_id}</p>
      <p>Person: {client.person_id}</p>
    </div>
  );
}

export default ClientView;