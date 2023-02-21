module.exports = function(app){
    app.delete('/account/:account_id', (req, res) => {
        const { account_id } = req.params;
        const sql = `DELETE FROM account WHERE account_id = ?`;
        connection.query(sql, [account_id], (err, result) => {
          if (err) throw err;
          res.send('Rachunek został usunięty');
        });
      });
}