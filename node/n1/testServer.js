const express = require("express");
const app = express();

app.get("/", (req, res) => {
    res.send("Test server working!");
});

app.listen(4000, () => {
    console.log("Test server started on port 4000");
});
