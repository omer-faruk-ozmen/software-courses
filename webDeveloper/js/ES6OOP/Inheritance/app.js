// function Person(name, age) {
//     this.name = name;
//     this.age = age;
// }

// Person.prototype.showInfos = function() {
//     console.log("İsim: " + this.name + "Yaş: " + this.age)
// }

// const person = new Person("Ömer Faruk", 22);
// console.log(person)


// function Employee(name, age, salary) {
//     Person.call(this, name, age)
//     this.salary = salary;
// }

// Employee.prototype = Object.create(Person.prototype)
// Employee.prototype.toString = function() {
//     console.log("Employee")
// }
// Employee.prototype.showInfos = function() {
//     console.log("İsim: " + this.name + "Yaş: " + this.age + "Maaş: " + this.salary)
// }

// const emp = new Employee("Ömer Faruk ", 22, 5000)

// console.log(emp)

// emp.showInfos();
// emp.toString()

class Person { //SuperClass, BaseClass
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    showInfos() {
        console.log("İsim: " + this.name + "Yaş: " + this.age)
    }
}
class Employee extends Person { //DerivedClass, SubClass, ChildClass
    constructor(name, age, salary) {
        // this.name = name;
        // this.age = age;

        super(name, age); //superclass'taki constructoru kullanır.
        this.salary = salary;
    }
    showInfos() { //Overriding
        console.log("İsim: " + this.name + "Yaş: " + this.age + "Maaş: " + this.salary)
    }
    toString() { //Overriding
        console.log("Employee")
    }
    raiseSalary(amount) {
        this.salary += amount;
    }
}

const emp = new Employee("Ömer Faruk", 22, 5000);
emp.raiseSalary(500);

console.log(emp);

emp.showInfos();
emp.toString();