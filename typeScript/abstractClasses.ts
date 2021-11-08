abstract class KrediBase {
  constructor() {}
  kaydet(): void {
    console.log("Kaydedildi");
  }
  abstract hesapla(): void;
}

class TuketiciKredisi extends KrediBase {
  constructor() {
    super();
  }
  hesapla(): void {
    console.log("Tüketici Kredisine göre hesap yapıldı");
  }
}
class KonutKredisi extends KrediBase {
  constructor() {
    super();
  }
  hesapla(): void {
    console.log("Konut Kredisine göre hesap yapıldı");
  }
  baskaoperasyon(): void {}
}
let tuketiciKredisi = new TuketiciKredisi();
tuketiciKredisi.hesapla();
tuketiciKredisi.kaydet();

let konutKredisi = new KonutKredisi();
konutKredisi.hesapla();
konutKredisi.kaydet();

let kredi: KrediBase;
kredi = new TuketiciKredisi();
kredi = new KonutKredisi();


