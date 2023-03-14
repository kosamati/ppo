import React, { useState, useEffect } from 'react';

function PersonList() {
  const [personList, setPersonList] = useState([]);

  useEffect(() => {
    fetch('http://localhost:2137/personlist')
    .then(response => response.json())
    .then(data => setPersonList(data));
}, []);

  return (
    <div>
      <h2>Person List</h2>
      <ul>
        {personList.map(person => (
          <li key={person.person_id}>{person.person_id}.{person.first_name} {person.last_name}</li>
        ))}
      </ul>
    </div>
  );
}

export default PersonList;