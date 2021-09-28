//Maps - Key - Value

let myMap = new Map(); //Oluşturma

console.log(typeof myMap)
console.log(myMap)

const key1 = "Ömer Faruk"
const key2 = { a: 10, b: 20 };
const key3 = () => 2;

//Set
myMap.set(key1, "String Değer");
myMap.set(key2, "Object Literal Değer");
myMap.set(key3, "Function Değer");

//Get
console.log(myMap.get(key1))
console.log(myMap.get(key2))
console.log(myMap.get(key3))


console.log(myMap)

//Map Boyutu
console.log(myMap.size)


const cities = new Map();
cities.set("Ankara", 5);
cities.set("İstanbul", 15);
cities.set("İzmir", 4);


//For Each
cities.forEach(function(value, key) {
    console.log(key, value)
})


//For of 
for (let [key, value] of cities) {
    console.log(key, value)
}

//Map Keys
for (let key of cities.keys()) {
    console.log(key)
}

//Map Values
for (let value of cities.values()) {
    console.log(value)
}

//Arraylerden map oluşturma
const array = [
    ["key1", "value1"],
    ["key2", "value2"]
]
const lastMap = new Map(array);
console.log(lastMap)


//Maplerden array oluşturma
const cities1 = new Map();

cities1.set("Ankara", 5);
cities1.set("İstanbul", 15);
cities1.set("İzmir", 4);

const array1 = Array.from(cities1);
// [["Ankara",5],["İstanbul",15],["İzmir",4]]
console.log(array1)