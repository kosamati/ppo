import React, { useState } from 'react';
import axios from 'axios';

function PersonPost() {
  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const [dateOfBirth, setDateOfBirth] = useState('');
  const [address, setAddress] = useState('');

  const handleSubmit = (event) => {
    event.preventDefault();
    axios.post('http://localhost:2137/person', {
      first_name: firstName,
      last_name: lastName,
      date_of_birth: dateOfBirth,
      address: address
    })
    .then(response => {
      console.log(response);
      // tu można zaktualizować stan aplikacji
    })
    .catch(error => {
      console.log(error);
    });
  }

  return (
    <form onSubmit={handleSubmit}>
      <label>
        First Name:
        <input type="text" value={firstName} onChange={e => setFirstName(e.target.value)} />
      </label>
      <label>
        Last Name:
        <input type="text" value={lastName} onChange={e => setLastName(e.target.value)} />
      </label>
      <label>
        Date of Birth:
        <input type="date" value={dateOfBirth} onChange={e => setDateOfBirth(e.target.value)} />
      </label>
      <label>
        Address:
        <input type="text" value={address} onChange={e => setAddress(e.target.value)} />
      </label>
      <button type="submit">Add Person</button>
    </form>
  );
}

export default PersonPost;
