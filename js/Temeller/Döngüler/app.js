let i = 0;

while (i < 10) {
    console.log(i);
    i++;
}



let x = 10;

while (x > 0) {
    console.log(x);
    x -= 2;
}

const langs = ["Python", "Javascript", "Java"];

let index = 0;
while (index < langs.length) {
    console.log(langs[index])
    index++;
}

//Break ve Continue
let a = 0;
while (a < 10) {
    console.log(a);
    if (a == 5) {
        break;
    }
    a++;
}

let c = 0;
while (c < 10) {
    if (c == 3 || c == 5) {
        c++
        continue;
    }
    console.log(c)
    c++;
}


//Do While
let d = 0;

do {
    console.log(d)
    d++;

} while (d < 10);


//For
for (let index = 0; index < langs.length; index++) {
    console.log(langs[index])
}

//forEach

langs.forEach(function(lang, index) {
    console.log(lang, index);
});


//Map
const users = [
    { name: "Ömer Faruk", age: 23 },
    { name: "Zeynep", age: 40 },
    { name: "Ali", age: 12 }
];

const names = users.map(function(user) {
    return user.name;
})
const ages = users.map(function(user) {
    return user.age;
})

console.log(names);
console.log(ages);


const person = {
    name: "Ömer Faruk",
    age: 23
};
for (let key in person) {
    console.log(key, person[key])
}