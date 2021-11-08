class Ev {
  _odaSayisi: number;
  _pencereSayisi: number;
  _kat: number;

  constructor(odaSayisi: number, pencereSayisi: number, kat: number) {
    this._odaSayisi = odaSayisi;
    this._kat = kat;
    this._pencereSayisi = pencereSayisi;
  }

  yemekYe() {
    console.log(this._kat + " katlı evde" + " Yemek yiyildi");
  }
}

let ev = new Ev(3, 4, 5);
ev.yemekYe();

console.log(ev._odaSayisi);

class Kisi {
  private _isim: string;

  get isim(): string {
    return "Sayın : " + this._isim;
  }
  set isim(ad: string) {
    this._isim = ad;
  }
  kaydet() {
    console.log("Kişi kaydedildi");
  }
}

class Musteri extends Kisi {
  satisYap() {
    console.log("Satış Yapıldı");
  }
}
class Personel extends Kisi {
  maasOde() {
    console.log("Maaş ödendi");
  }
}

let musteri = new Musteri();

musteri.kaydet();
musteri.isim = "Omer Faruk";
console.log(musteri.isim);

let personel = new Personel();

personel.maasOde();
