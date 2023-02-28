const connection = require("../../connection") 

module.exports = function(app){
    app.put('/person/:person_id', (req, res) => {
        const { first_name, last_name, date_of_birth, address } = req.body;
        const { person_id } = req.params;
        const sql = `UPDATE person SET first_name = ?, last_name = ?, date_of_birth = ?, address = ? WHERE person_id = ?`;
        connection.query(sql, [first_name, last_name, date_of_birth, address, person_id], (err, result) => {
          if (err) throw err;
          res.send('Dane osobowe zostały zaktualizowane');
        });
      });
}