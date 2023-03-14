import React, { useState } from 'react';
import axios from 'axios';

function UpdatePerson() {
  const [personId, setPersonId] = useState('');
  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const [dateOfBirth, setDateOfBirth] = useState('');
  const [address, setAddress] = useState('');
  const [message, setMessage] = useState('');

  const handleUpdate = () => {
    axios
      .put(`http://localhost:2137/person/${personId}`, {
        first_name: firstName,
        last_name: lastName,
        date_of_birth: dateOfBirth,
        address: address,
      })
      .then((res) => {
        setMessage(res.data);
      })
      .catch((err) => {
        console.log(err);
        setMessage('Wystąpił błąd. Dane osobowe nie zostały zaktualizowane.');
      });
  };

  return (
    <div>
      <h2>Zaktualizuj dane osobowe</h2>
      <label>
        ID osoby:
        <input type="text" value={personId} onChange={(e) => setPersonId(e.target.value)} />
      </label>
      <br />
      <label>
        Imię:
        <input type="text" value={firstName} onChange={(e) => setFirstName(e.target.value)} />
      </label>
      <br />
      <label>
        Nazwisko:
        <input type="text" value={lastName} onChange={(e) => setLastName(e.target.value)} />
      </label>
      <br />
      <label>
        Data urodzenia:
        <input type="date" value={dateOfBirth} onChange={(e) => setDateOfBirth(e.target.value)} />
      </label>
      <br />
      <label>
        Adres:
        <input type="text" value={address} onChange={(e) => setAddress(e.target.value)} />
      </label>
      <br />
      <button onClick={handleUpdate}>Zaktualizuj</button>
      <p>{message}</p>
    </div>
  );
}
export default UpdatePerson;
