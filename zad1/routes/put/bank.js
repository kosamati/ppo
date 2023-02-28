const connection = require("../../connection") 

module.exports = function(app){
    app.put('/bank/:bank_id', (req, res) => {
        const { bank_name, bank_address } = req.body;
        const { bank_id } = req.params;
        const sql = `UPDATE bank SET bank_name = ?, bank_address = ? WHERE bank_id = ?`;
        connection.query(sql, [bank_name, bank_address, bank_id], (err, result) => {
          if (err) throw err;
          res.send('Dane banku zostały zaktualizowane');
        });
      });
}