const connection = require("../../connection") 

module.exports = function(app){
    app.get('/person/:person_id', (req, res) => {
        const { person_id } = req.params;
        const sql = `SELECT * FROM person WHERE person_id = ?`;
        connection.query(sql, [person_id], (err, result) => {
          if (err) throw err;
          res.send(result);
        });
      });
}