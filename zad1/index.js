const express = require("express");
const app = express();
const path = require("path")
const cors = require('cors');



app.set("trust proxy", true);
app.use(express.static(path.join(__dirname, "public")));
app.use(express.json());
app.use(cors());

//get Read
require("./routes/get/person")(app)
require("./routes/get/bank")(app)
require("./routes/get/account")(app)
require("./routes/get/client")(app)

//delete 
require("./routes/delete/person")(app)
require("./routes/delete/bank")(app)
require("./routes/delete/account")(app)
require("./routes/delete/client")(app)

//post Create
require("./routes/post/person")(app)
require("./routes/post/bank")(app)
require("./routes/post/account")(app)
require("./routes/post/client")(app)

//put update 
require("./routes/put/person")(app)
require("./routes/put/bank")(app)
require("./routes/put/account")(app)
require("./routes/put/client")(app)

app.listen(2137, () => {
    console.log("Listen on port 2137")
})
