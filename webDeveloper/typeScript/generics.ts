function deger(x: number): number {
  return x;
}
function deger2(x: string): string {
  return x;
}

let sayi = deger(10);
console.log(sayi);

let sehir = deger2("Ankara");
console.log(sehir);

function deger3<Type>(x: Type): Type {
  return x;
}

let sayi3 = deger3<Number>(2);
let sehir3 = deger3<string>("Ankara");

console.log(sayi3);
console.log(sehir3);

class GenericClass<T> {
  degisken: T;
  fonksiyon(parametre: T): T {
    return parametre;
  }
}

let sinif = new GenericClass<number>()

sinif.fonksiyon(5)
