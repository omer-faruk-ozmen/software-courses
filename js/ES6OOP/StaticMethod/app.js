//Static Method

class Math {
    sqrt(x) {
        console.log(x * x)
    }
    static cube(x) { //Static olduğunda mate.cube(3) şeklinde değer alamayız.
        console.log(x * x * x);
    }
}

const mate = new Math();
Math.cube(3);

console.log(mate)
mate.sqrt(4);