module.exports = function(app){
    app.get('/client/:client_id', (req, res) => {
        const { client_id } = req.params;
        const sql = "SELECT * FROM client WHERE client_id = ?";
        connection.query(sql, [client_id], (err, result) => {
        if (err) throw err;
        res.send(result);
        });
        });
}