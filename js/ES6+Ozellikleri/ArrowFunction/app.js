//EcmaScript


const merhaba = function() {
    console.log("Merhaba");
}

merhaba();


//Arrow Function
const merhaba1 = () => {
    console.log("Merhaba Arrow Function");
}
merhaba1();

const merhaba2 = (firstName, lastName) => {
    console.log("Merhaba" + firstName + lastName);
}
merhaba2(" Ömer Faruk ", "Özmen");


//Tek parametre alacaksa parantezler gerekmez
//Tek İşlem varsa süslü parentez gerekmez.
const merhaba3 = firstName => console.log("Merhaba" + firstName);

merhaba3(" Ömer Faruk");

const merhaba4 = (firstName, lastName) => console.log("Merhaba" + firstName + lastName);

merhaba4(" Ömer Faruk", " Özmen");


//Fonksiyon tek bir işlem yaparsa return ve süslü paranteze gerek kalmaz.
const cube = x => x * x * x
console.log(cube(4))