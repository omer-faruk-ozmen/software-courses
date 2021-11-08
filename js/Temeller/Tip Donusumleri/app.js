let value;

//Veritiplerini Stringe Çevirme

value = 123;
value = String(3.14)
value = String(true)
value = String(false)
value = String(function() { console.log() })
value = String([1, 2, 3, 4])

value = (10).toString();
value = (3.14).toString();

//Veritiplerini Sayılara Çevirme

value = Number("123") //sadece string içindeki sayılar ve null çevrilebilir
value = Number(null)
value = Number(undefined)
value = Number("Hello World")
value = Number(function() { console.log() })
value = Number([1, 2, 3, 4, 5])

value = Number("2.14")
value = parseFloat("3.14")
value = parseInt("3")

console.log(value);
console.log(typeof value)

const a = "Hello" + 34 //JS stringe çevirir
console.log(a)
console.log(typeof a)

const b = Number("54") + 34
console.log(b)
console.log(typeof b)