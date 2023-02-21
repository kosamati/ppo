module.exports = function(app){
    app.delete('/bank/:bank_id', (req, res) => {
        const { bank_id } = req.params;
        const sql = "DELETE FROM bank WHERE bank_id = ?";
        connection.query(sql, [bank_id], (err, result) => {
        if (err) throw err;
            res.send('Bank został usunięty');
        });
    });
}