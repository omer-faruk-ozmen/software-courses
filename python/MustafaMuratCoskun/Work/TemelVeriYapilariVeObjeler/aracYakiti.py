aracYakit = float(input("Araç km'de kaç litre benzin yakıyor?"))
gidilecekYol = float(input("Toplam mesafe giriniz.(km)"))
litreBenzin = float(input("Benzinin Litre Fiyatını Giriniz."))

sonuc = (gidilecekYol/aracYakit) * (litreBenzin)

print("Ortalama Yakıt Tutarı: {}".format(sonuc))