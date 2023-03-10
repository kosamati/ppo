const connection = require("../../connection") 

module.exports = function(app){
    app.get('/account/:account_id', (req, res) => {
        const { account_id } = req.params;
        console.log(`Geting account ${account_id}`)
        const sql = `SELECT * FROM account WHERE account_id = ?`;

        connection.query(sql, [account_id], (err, result) => {
          
          if (err) throw err;
          res.send(result);
          console.log(`${result} `)
        });
      });
}