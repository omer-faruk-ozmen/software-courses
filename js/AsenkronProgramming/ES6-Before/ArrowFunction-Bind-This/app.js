const person = {
    age: 25,
    /*
    tellAge: function() {
            //kendi fonksiyonumuz içindedi this kendi person objemizi gösterir.
            console.log(this)
            console.log(this.age)
        }.bind(this) //bu alandaki this window gösterir
        */


    tellAge: () => { //arrow function halindeki this'de yukarıdaki bind(this) gibi çalışır.
        console.log(this);
        console.log(this.age);
    }
}



person.tellAge();