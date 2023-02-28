const connection = require("../../connection") 
module.exports = function(app){
    app.delete('/client/:client_id', (req, res) => {
        const { client_id } = req.params;
        const sql = "DELETE FROM client WHERE client_id = ?";
        connection.query(sql, [client_id], (err, result) => {
        if (err) throw err;
        res.send('Klient został usunięty');
        });
        });
}