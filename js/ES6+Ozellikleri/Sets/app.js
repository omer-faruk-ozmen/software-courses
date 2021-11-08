//Setler - Kümeler
//Bir değeri sadece bir defa taşır

const mySet = new Set();

mySet.add(100);
mySet.add(100);
mySet.add("Ömer Faruk Özmen");
mySet.add(true);
mySet.add([1, 2, 3]);
mySet.add({ a: 1, b: 2 });


//Kısa Yoldan Set Oluşturma
const mySet2 = new Set([100, "Ömer Faruk Özmen"])



console.log(mySet);
console.log(mySet2);

// Size
console.log(mySet.size)

// Delete Method
mySet.delete("Ömer Faruk Özmen")
console.log(mySet)

// Has Method
console.log(mySet.has("Ömer Faruk Özmen"))
console.log(mySet.has(100))
console.log(mySet.has([1, 2, 3]))


// For Each
mySet.forEach(function(value) {
    console.log(value)
})

// For Of
for (let value of mySet) {
    console.log(value)
}

//Setten Array Oluşturma

const array = Array.from(mySet);
console.log(array)