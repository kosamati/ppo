module.exports = function(app){
    app.get('/bank/:bank_id', (req, res) => {
        const { bank_id } = req.params;
        const sql = `SELECT * FROM bank WHERE bank_id = ?`;
        connection.query(sql, [bank_id], (err, result) => {
          if (err) throw err;
          res.send(result);
        });
      });
}