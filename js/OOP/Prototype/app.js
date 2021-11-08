const object = new Object();
const object2 = new Object();
object.name = "Ömer Faruk"
console.log(object);


function Employee(name, age) {
    this.name = name;
    this.age = age;

    this.toString = function() {
        console.log("Bu bir Employee Objesi")
    }
}

//Miras Alma Mantığında
Employee.prototype.showInfos = function() {
    console.log("İsim: " + this.name + "Yaş: " + this.age)
}



const emp1 = new Employee("Ömer Faruk", 22);
const emp2 = new Employee("Ahmet", 27);

console.log(emp1.toString())

console.log(emp1)
console.log(emp2)