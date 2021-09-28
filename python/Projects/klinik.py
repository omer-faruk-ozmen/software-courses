import os
import cv2
from datetime import datetime

suan = datetime.now()
simdikizaman = str(suan)


hasta_ismi = input("Hasta ismini giriniz.\n(Türkçe Karakter Kullanmadan)") 
hastaResim = cv2.imread(("{}").format(input("Resmi Sürükleyiniz.")))
yapilanislemler = input("Yapılan işlemler ve kullanılan malzemeleri yazınız.")
yil = str(suan.year)
ay = str(suan.month)
gun = str(suan.day)

if ay == "3":
    ay = "Mart"

os.makedirs(("c:/Users/OFO/Desktop/Klinik/{}/{}/{}/{}").format(yil,ay,gun,hasta_ismi))

konum = str(("c:/Users/OFO/Desktop/Klinik/{}/{}/{}/{}/HastaResim.png").format(yil,ay,gun,hasta_ismi))
hastaKonum = str(konum)

bilgiKonum = str(("c:/Users/OFO/Desktop/Klinik/{}/{}/{}/{}/HastaBilgisi.txt").format(yil,ay,gun,hasta_ismi))
hastaBilgisi = str(bilgiKonum)
dosya = open(hastaBilgisi,"w")

print(konum)
cv2.imwrite(hastaKonum,hastaResim)
dosya.write(simdikizaman + "\n\n\n"+ hasta_ismi + "\n\n\n" + yapilanislemler)

print("Kaydedildi.")