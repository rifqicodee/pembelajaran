const express = require('express');
const app = express();

app.get('/users/:id', (req,res) =>{
    const usersId = req.params.id;
    if(usersId == 3){
    res.json({
        id: usersId,
        nama: "aziz",
        umur: 18
    })   
    }
    res.json({
        id: usersId,
        nama: "unknown",
        umur: 18
    })
})

app.listen(3000, () => {
    console.log("port sudah berjalan di 3000")
});