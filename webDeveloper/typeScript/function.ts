function topla(x, y) {
  return x + y;
}
function topla2(x: number, y: number): number {
  return x + y;
}

topla2(2, 5);

let topla3 = function (x: number, y: number): number {
  return x + y;
};

console.log(topla(2, 3));
console.log(typeof topla(2, 3));
console.log(typeof topla2(2, 3));
console.log(topla3(5, 3));

//default değer
function topla4(x: number, y: number = 5): number {
  return x + y;
}

console.log(topla4(2));

// "?" undefined durumda olur(en sondaki atamalarda olmalı)
//NaN döner bunu engellemek için if bloğuna al
function topla5(x: number, y?: number): number {
  if (y) {
    return x + y;
  }
  return x;
}

console.log(topla5(2));
console.log(topla5(5, 15));

// ... dizi tanımlamak için
function davetEt(ilkDavetli: string, ...digerleri: string[]): string {
  return ilkDavetli + " , " + digerleri.join(" , ");
}

console.log(davetEt("Ömer Faruk", "Muhammed", "Özgür"));


// ilk davetli kısmı şart değil yol gösterme açısından sadece bilgilendirme için
function davetEt2(...digerleri: string[]): string {
  return digerleri.join(" , ");
}

console.log(davetEt("Ömer Faruk", "Muhammed", "Özgür"));
