const connection = require("../../connection") 


module.exports = function(app){
    app.post('/client', (req, res) => {
        const { client_name, client_email, client_phone } = req.body;
        const sql = "INSERT INTO client (client_name, client_email, client_phone) VALUES (?, ?, ?)";
        connection.query(sql, [client_name, client_email, client_phone], (err, result) => {
        if (err) throw err;
        res.send('Dodano nowego klienta');
        });
        });
}