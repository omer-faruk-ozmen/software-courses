let value;

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 42];

const numbers1 = new Array(34, 35, 36, 37, 38);

const langs = ["Python", "Java", "C++", "Javascript"];

const a = ["Merhaba", 22, null, undefined, 3.14];


value = numbers.length;

value = numbers[0];
value = numbers[2];
value = numbers[numbers.length - 1];

//Herhangi bir index'teki değeri değiştirme

numbers[2] = 1000;

value = numbers;

//Index Of
value = numbers.indexOf(1000)

//Arrayin sonuna değer ekleme
numbers.push(2424);

//Arrayin başına değer ekleme
numbers.unshift
value = numbers;

//Sonundan değer atma 
numbers.pop();
value = numbers;

//Başından değer atma
numbers.shift();
value = numbers;

//Belli bir indexe kadar değer atma
numbers.splice(0, 3);
value = numbers;

//Reverse
numbers.reverse();
value = numbers;

//Sıralama
value = numbers.sort(); //sadece ilk rakama bakarak sıralar

value = numbers.sort(function(x, y) { //küçükten büyüğe
    return x - y;
})

value = numbers.sort(function(x, y) { //büyükten küçüğe
    return y - x;
})


console.log(value);