const connection = require("../../connection") 
module.exports = function(app){
    app.post('/person', (req, res) => {
      console.log(req.body)

        const { first_name, last_name, date_of_birth, address } = req.body;
        const sql = `INSERT INTO person (first_name, last_name, date_of_birth, address) VALUES (?, ?, ?, ?)`;
        connection.query(sql, [first_name, last_name, date_of_birth, address], (err, result) => {
          if (err) throw err;
          res.send('Dodano nową osobę');
        });
      });
}