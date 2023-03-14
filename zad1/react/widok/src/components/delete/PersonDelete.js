import React, { useState } from 'react';
import axios from 'axios';

function DeletePerson() {
  const [message, setMessage] = useState(null);
  const [personId, setpersonId] = useState(null);

  function handleDelete() {
    axios.delete(`http://localhost:2137/person/${personId}`)
      .then(response => {
        setMessage(response.data);
      })
      .catch(error => {
        console.error(error);
      });
  }

  return (
    <div>
      <label>
        ID rachunku:
        <input
          type="text"
          value={personId}
          onChange={(e) => setpersonId(e.target.value)}
        />
      </label>
      <button onClick={handleDelete}>Delete Person</button>
      {message && <p>{message}</p>}
    </div>
  );
}

export default DeletePerson;