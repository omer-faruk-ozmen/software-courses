//Syntactic Sugar


/*
ESKİ YÖNTEM
function Employee(name, age, salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
}

Employee.prototype.showInfos = function() {
    console.log("İsim " + this.name + "Yaş " + this.age)
}

const emp = new Employee("Ömer Faruk Özmen", 22, 4000);
console.log(emp)
*/


//ES6 ile yeni yöntem

class Employee {
    constructor(name, age, salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    showInfos() {
        console.log("İsim " + this.name + "Yaş " + this.age)
    }
}

const emp = new Employee("Ömer Faruk", 22, 5000)
console.log(emp)
emp.showInfos();