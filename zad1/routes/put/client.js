module.exports = function(app){
    app.put('/client/:client_id', (req, res) => {
        const { client_name, client_email, client_phone } = req.body;
        const { client_id } = req.params;
        const sql = "UPDATE client SET client_name = ?, client_email = ?, client_phone = ? WHERE client_id = ?";
        connection.query(sql, [client_name, client_email, client_phone, client_id], (err, result) => {
        if (err) throw err;
        res.send('Dane klienta zostały zaktualizowane');
        });
        });
}