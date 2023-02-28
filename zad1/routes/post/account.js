const connection = require("../../connection") 

module.exports = function(app){
    app.post('/account', (req, res) => {
        const { account_number, account_type, balance, person_id } = req.body;
        const sql = `INSERT INTO account (account_number, account_type, balance, person_id) VALUES (?, ?, ?, ?)`;
        connection.query(sql, [account_number, account_type, balance, person_id], (err, result) => {
          if (err) throw err;
          res.send('Dodano nowy rachunek');
        });
      });
}