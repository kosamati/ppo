const connection = require("../../connection") 

module.exports = function(app){
    app.get('/personlist', (req, res) => {
        const sql = `SELECT * FROM person;  `;
        connection.query(sql, (err, result) => {
          if (err) throw err;
          res.send(result);
          console.log(result);
        });
      });
}