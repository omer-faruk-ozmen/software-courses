function merhaba(name = "Bilgi Yok", age = "Bilgi Yok") {

    // if (typeof name === "undefined") name = "Bilgi Yok";
    // if (typeof age === "undefined") age = "Bilgi Yok";

    console.log(`İsim: ${name} Yaş: ${age}`)
}

merhaba("Ömer Faruk", 25);
merhaba();

merhaba("Kadir")



//Fonksiyonu başka fonksiyona göndermek için değer döndermesi gerekir.
function square(x) {
    return x * x; //return fonksiyonu sonlandırır.
}

function cube(x) {
    return x * x * x;
}

let a = cube(square(12))

console.log(a)


function selam() {
    return "Selam";
}
console.log(selam());


//Function Expression
const selamla = function(name) {
    console.log("Selam " + name)
};

selamla("Ömer");


//Immediately Invoked Function Expression (IIFE)
//Tanımlandığı yerde çalışır.

(function(name) {
    console.log("Merhaba : " + name)
})("Ömer Faruk")


const database = {
    host: "localhost",
    add: function() {
        console.log("Eklendi")
    },
    get: function() {
        console.log("Elde edildi")
    },
    update: function(id) {
        console.log(`Id : ${id} Güncellendi`)
    },
    delete: function(id) {
        console.log(`Id: ${id} Silindi`)
    }
}

console.log(database.host);

database.add();

database.delete(19);