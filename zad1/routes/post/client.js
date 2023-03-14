const connection = require("../../connection") 


module.exports = function(app){
    app.post('/client', (req, res) => {
        console.log("c")
        const { person_id, bank_id} = req.body;
        console.log(person_id,bank_id)
        const sql = "INSERT INTO client (person_id, bank_id) VALUES (?, ?)";
        connection.query(sql, [person_id, bank_id], (err, result) => {
        if (err) throw err;
            console.log('Dodano nowego klienta');
        });
        });
}