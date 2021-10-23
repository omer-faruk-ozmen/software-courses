function greeter(name: string) {
  return "Hello " + name;
}

let message = greeter("Omer");

console.log(message);

//tanımlama

let sayi: number;
sayi = 10;
sayi = 10.4;

let sehir: string = "Adana";
sehir = "Ankara";
sehir = "İstanbul";

let dogruMu: boolean;
dogruMu = true;
dogruMu = false;

let sayilar: number[] = [1, 2, 3, 4, 5];

let sayilar2: Array<number> = [1, 2, 3, 4, 5];

let dizi: [number, string] = [2, "Ankara"];

dizi[0] = 1;
dizi[1] = "İstanbul";

enum Renk {
  Kirmizi = 1,
  Siyah,
  Mavi,
}

let renk: Renk = Renk.Kirmizi;

//any tüm veri tiplerini kullanabilir
let deger: any = "Ankara";
deger = 2;
deger = {};

//void fonksiyonlarda kullanılır. return alamaz
let deger2: void = undefined;
function selamVer(): void {
  console.log("Merhaba");
}

//undefined - null
let yas: number;
//yas suan undefined
yas = 10;

//null referansı oluşmamıştır.
class Musteri {}
