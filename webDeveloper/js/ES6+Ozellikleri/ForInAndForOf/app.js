const person = {
    name: "Ömer Faruk",
    age: 22,
    salary: 5000
}

const langs = ["Python", "Java", "C++", "Php"]

const name = "Ömer Faruk";


//For In
//Object
for (let prop in person) {
    console.log(prop, person[prop])
}

//Array
for (let index in langs) {
    console.log(index, langs[index])
}

//String

for (let index in name) {
    console.log(index, name[index])
}


//For Of
//Array Üzerinde gezilebilir.Değerlere Direkt Ulaşır
for (let value of langs) {
    console.log(value)
}

//String
for (let character of name) {
    console.log(character)
}