/*
import { Person } from "./app1";
import { Employee } from "./app2";


Person.Test();
Employee.Test();
console.log("Dosya Değişti")


//Commonjs Modülleri

const module = require("./module");

console.log(module);
module();
module.test2();
module.test3();

console.log(module.person.name);
module.person.test1();
console.log(module.person.person.name);
*/

//ES6 Modulleri

//import { test, Person, employee } from "./module";

//Tek tek yazmak yerine * kullanılabilir
import * as module from "./module";
console.log(module)


// Person.Test();
// test();
// console.log(employee.salary)
console.log(module.employee.salary)
module.Person.Test();

/*
import Deneme from "./module";
Deneme.deneme();
*/

import denemeVal from "./module";
console.log(denemeVal)