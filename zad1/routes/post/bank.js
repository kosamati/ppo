module.exports = function(app){
    app.post('/bank', (req, res) => {
        const { bank_name, bank_address } = req.body;
        const sql = `INSERT INTO bank (bank_name, bank_address) VALUES (?, ?)`;
        connection.query(sql, [bank_name, bank_address], (err, result) => {
          if (err) throw err;
          res.send('Dodano nowy bank');
        });
      });
}