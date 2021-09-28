let number1, number2;

arr = [100, 200, 300, 400];

// number1 = arr[0];
// number2 = arr[1];


//Destructing
[number1, number2] = arr;

//Veya
const [number3, number4] = arr;

console.log(number1, number2)
console.log(number3, number4)


// Obje Destructing
const numbers = {
    a: 10,
    b: 20,
    c: 30,
    d: 40
}

//Objelerde sırası ile bakmaz isime göre bakar.(anahtar kelime)
const { a, b, c } = numbers;
console.log(a, b, c)


//Function Destructing
const getLangs = () => ["Python", "Java", "C++"];

const [lang1, lang2, lang3] = getLangs();
console.log(lang1, lang2, lang3)


//Obje
const person = {
    name: "Ömer Faruk",
    year: 1999,
    salary: 5000,
    showInfos: () => console.log("Bilgiler Gösteriliyor...")
}
const { name: isim, year: yil, salary: maas, showInfos: bilgileriGoster } = person;
console.log(isim, yil, maas);
bilgileriGoster();