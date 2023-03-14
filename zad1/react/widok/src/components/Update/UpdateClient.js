import React, { useState } from 'react';
import axios from 'axios';

function UpdateClient() {
  const [personId, setPersonId] = useState('');
  const [bankId, setBankId] = useState('');
  const [clientId, setClientId] = useState('');

  const handleSubmit = async (event) => {
    event.preventDefault();
    try {
      const response = await axios.put(`http://localhost:2137/client/${clientId}`, {
        person_id: personId,
        bank_id: bankId
      });
      console.log(response.data);
      alert('Dane klienta zostały zaktualizowane');
    } catch (error) {
      console.error(error);
      alert('Wystąpił błąd podczas aktualizowania danych klienta');
    }
  };

  return (
    <div>
      <h2>Aktualizuj dane klienta</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="personId">ID osoby:</label>
          <input
            type="text"
            id="personId"
            value={personId}
            onChange={(event) => setPersonId(event.target.value)}
            required
          />
        </div>
        <div>
          <label htmlFor="bankId">ID banku:</label>
          <input
            type="text"
            id="bankId"
            value={bankId}
            onChange={(event) => setBankId(event.target.value)}
            required
          />
        </div>
        <div>
          <label htmlFor="clientId">ID klienta:</label>
          <input
            type="text"
            id="clientId"
            value={clientId}
            onChange={(event) => setClientId(event.target.value)}
            required
          />
        </div>
        <button type="submit">Aktualizuj</button>
      </form>
    </div>
  );
}

export default UpdateClient;
