const connection = require("../../connection") 

module.exports = function(app){
    app.put('/client/:client_id', (req, res) => {
        const { person_id, bank_id } = req.body;
        const { client_id } = req.params;
        const sql = "UPDATE client SET person_id = ?, bank_id = ?  WHERE client_id = ?";
        connection.query(sql, [person_id, bank_id, client_id], (err, result) => {
        if (err) throw err;
        res.send('Dane klienta zostały zaktualizowane');
        });
        });
}