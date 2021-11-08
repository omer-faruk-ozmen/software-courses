let value;
const programmer = {
    name: "Ömer Faruk Özmen",
    age: 23,
    email: "omerfarukozmen0@gmail.com",
    langs: ["Python", "Java", "Javascript"],
    address: {
        city: "Kars",
        street: "Sehitler"
    },

    work: function() {
        console.log("Programcı Çalışıyor")
    }
}

value = programmer;

value = programmer.email; //Genel Kullanım
value = programmer["email"]

value = programmer.langs;
value = programmer.address;
value = programmer.address.city;

programmer.work();

const programmers = [
    { name: "Ömer Faruk Özmen", age: 23 },
    { name: "Oğuz", age: 25 }
];

value = programmers[0].age;

console.log(value);