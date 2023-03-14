import React, { useState } from "react";
import axios from "axios";

const DeleteClient = () => {
  const [clientID, setClientID] = useState("");

  const handleDelete = () => {
    axios
      .delete(`http://localhost:2137/client/${clientID}`)
      .then((res) => {
        console.log(res.data);
      })
      .catch((err) => {
        console.error(err);
      });
  };

  return (
    <div>
      <h2>Usuń rachunek</h2>
      <label>
        ID osoby:
        <input
          type="text"
          value={clientID}
          onChange={(e) => setClientID(e.target.value)}
        />
      </label>
      <button onClick={handleDelete}>Usuń klienta</button>
    </div>
  );
};

export default DeleteClient;
