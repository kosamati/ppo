import React, { useState, useEffect } from 'react';
import axios from 'axios';

function Person({ personID }) {
  const [person, setPerson] = useState(null);
    
  useEffect(() => {
    axios.get(`http://localhost:2137/person/${personID}`)
      .then(response => {
        setPerson(response.data);
        
      })
      .catch(error => {
        console.log(error);
      });
  }, [personID]);

  if (!person) {
    return <div>Loading...</div>;
  }

  return (
    
    <div>
        <h1>first_name: {person[0].first_name}</h1>
        <p>last_name : {person[0].last_name}</p>
        <p>date_of_birth: {person[0].date_of_birth}</p>
        <p>address: {person[0].address}</p>
    </div>
  );
}

export default Person;