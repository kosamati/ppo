const connection = require("../../connection") 

module.exports = function(app){
    app.get('/personlist/', (req, res) => {
        const { person_id } = req.params;
        const sql = `SELECT * FROM person `;
        connection.query(sql, (err, result) => {
          if (err) throw err;
          res.send(result);
        });
      });
}