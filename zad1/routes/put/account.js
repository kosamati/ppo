const connection = require("../../connection") 

module.exports = function(app){
    app.put('/account/:account_id', (req, res) => {
        const { balance } = req.body;
        const { account_id } = req.params;
        const sql = `UPDATE account SET balance = ? WHERE account_id = ?`;
        connection.query(sql, [balance, account_id], (err, result) => {
          if (err) throw err;
          res.send('Stan konta został zaktualizowany');
        });
      });
}