console.log(this); //Global Scope

const emp1 = { //Object Literal
    name: "Ömer",
    age: 22,
    showInfos: function() { console.log("Bilgiler Gösteriliyor") }
}
console.log(emp1);

emp1.salary = 5000;

console.log(emp1)


//Constructor Oluşturma
function Employee(name, age, salary) { //Yapıcı Fonksiyon
    this.name = name;
    this.age = age;
    this.salary = salary;

    this.showInfos = function() {
        console.log(this.name, this.age, this.salary)
    }
}

const emp2 = new Employee("Ömer Faruk", 22, 5000);
const emp3 = new Employee("Ahmet", 25, 4000);

console.log(emp2)


emp2.showInfos();