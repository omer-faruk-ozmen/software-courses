/*
//Sadece tek bir fonksiyon export edilir
module.exports = function test1() {
    console.log("Test 1")
}


module.exports.test2 = function test2() {
    console.log("Test 2")
}
module.exports.test3 = function test3() {
    console.log("Test 3")
}

module.exports.person = {
    name: "Ömer Faruk",
    test1: function() {
        console.log("Test 1")
    },
    person: {
        name: "Ömer Faruk",
        mail: "omerfarukozmen0@gmail.com"
    }
}

*/

//ES6 Modules

export const name = "Ömer";
export function test() {
    console.log("Test Fonksiyonu");
}
export class Person {
    static Test() {
        console.log("Person Test")
    }
}
export const employee = {
    name: "Ömer Faruk",
    salary: 5000
}

/*
export default class Deneme {
    static deneme() {
        console.log("Default Deneme")
    }
}
*/

const denemeVal = "Deneme Değeri";
export default denemeVal;