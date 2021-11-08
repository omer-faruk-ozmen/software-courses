//Değişken Oluşturma

var a = 20;
var b = 10;
var c = 40;

console.log(a, b, c)


// Primitive Veri Tipleri (sadece değer taşır bellekteki yeri tutmazlar.)

var x = 10; //number değer
console.log(typeof x);

var y = 3.14; //number değer
console.log(typeof y);

var name = "Ömer Faruk" //string
console.log(typeof name);

var c = true; //boolean
console.log(typeof c)

var d = null; //null boş değer hiçbir şey taşımaz
console.log(d)

var e; //undefined hiçbir değer verilmemiş
console.log(e)


// Reference Veri Tipleri

var numbers = [1, 2, 3, 4, 5]; //Array
console.log(numbers);
console.log(typeof numbers);
console.log(numbers[0])


var person = {
    name: "Ömer Faruk Özmen",
    age: 23
}
console.log(person);
console.log(typeof person)


var date = new Date();
console.log(date)
console.log(typeof date)

var merhaba = function() {
    console.log("Merhaba")
}
console.log(merhaba)
console.log(typeof merhaba)