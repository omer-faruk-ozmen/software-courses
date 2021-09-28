//Global Scope

var value1 = 10;
let value2 = 20;
const value3 = 30;

function Func() {
    var value1 = 40;
    let value2 = 50;
    const value3 = 60;
    console.log(value1, value2, value3)
}

Func();

console.log(value1, value2, value3)



function a() {
    //Function Scope (sadece fonksiyon içine özgü)
}


if (true) {
    //Block Scope
    var a = 10;
    let b = 20;
    const c = 30;
    console.log(a, b, c);

    var value1 = 40;
    let value2 = 50;
    const value3 = 60;
}
console.log(a); //var tanımlı her yerde kullanılır.
// console.log(b);
// console.log(c);

console.log(value1, value2, value3); //block scope de değer verilirse global deki değeri değiştirir.
//Let scope özgüdür değişmez.


var database = "123456";
if (true) {
    var database = "56234";
    console.log(database) //var ile tanımlanırsa globaldeki değişkeni etkiler
}

const databaseP = "123456";

if (true) {
    const databaseP = "56234";
    console.log(databaseP) //let veya const ile tanımlanırsa globaldeki değişken etkilenmez
}