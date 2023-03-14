import React, { useState, useEffect } from 'react';
import axios from 'axios';

function ClientView(props) {
  const [client, setClient] = useState(null);

  useEffect(() => {
    axios.get(`/client/${props.clientId}`)
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
      <h2>{client.first_name} {client.last_name}</h2>
      <p>Date of birth: {client.date_of_birth}</p>
      <p>Address: {client.address}</p>
    </div>
  );
}

export default ClientView;