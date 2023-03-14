import React, { useState } from "react";
import axios from "axios";

const DeleteAccount = () => {
  const [accountId, setAccountId] = useState("");

  const handleDelete = () => {
    axios
      .delete(`http://localhost:2137/account/${accountId}`)
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
          value={accountId}
          onChange={(e) => setAccountId(e.target.value)}
        />
      </label>
      <button onClick={handleDelete}>Usuń rachunek</button>
    </div>
  );
};

export default DeleteAccount;
