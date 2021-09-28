let a = "Ömer Faruk"
let b = "Ömer Faruk"

if (a === b) {
    console.log("Eşit")
}

let array1 = [1, 2, 3, 4, 5]
let array2 = [1, 2, 3, 4, 5]

if (array1 === array2) {
    console.log("Eşit")
} else {
    console.log("Referans Değerler Karşılaştırılmaz")
}


const cities = new Map();

const key = [1, 2, 3];

cities.set("Ankara", 5)
cities.set("İstanbul", 15)
cities.set(key, "Array")

console.log(cities.get(key));
console.log(cities.get("Ankara"));