function topla(x, y) {
    return x + y;
}
function topla2(x, y) {
    return x + y;
}
topla2(2, 5);
var topla3 = function (x, y) {
    return x + y;
};
console.log(topla(2, 3));
console.log(typeof topla(2, 3));
console.log(typeof topla2(2, 3));
console.log(topla3(5, 3));
//default değer
function topla4(x, y) {
    if (y === void 0) { y = 5; }
    return x + y;
}
console.log(topla4(2));
// "?" undefined durumda olur(en sondaki atamalarda olmalı)
//NaN döner bunu engellemek için if bloğuna al
function topla5(x, y) {
    if (y) {
        return x + y;
    }
    return x;
}
console.log(topla5(2));
console.log(topla5(5, 15));
// ... dizi tanımlamak için
function davetEt(ilkDavetli) {
    var digerleri = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        digerleri[_i - 1] = arguments[_i];
    }
    return ilkDavetli + " , " + digerleri.join(" , ");
}
console.log(davetEt("Ömer Faruk", "Muhammed", "Özgür"));
// ilk davetli kısmı şart değil yol gösterme açısından sadece bilgilendirme için
function davetEt2() {
    var digerleri = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        digerleri[_i] = arguments[_i];
    }
    return digerleri.join(" , ");
}
console.log(davetEt("Ömer Faruk", "Muhammed", "Özgür"));
