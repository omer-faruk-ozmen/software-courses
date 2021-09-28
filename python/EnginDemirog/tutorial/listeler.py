

krediler = ["Hızlı Kredi","Maaşını Halkbank'tan alanlara özel","Mutlu emekli ihtiyaç kredisi"]


print(krediler)

print(krediler[0]) #ekrana 0. sıradaki elemanı yazdırır
print(krediler[1])
print(krediler[2])
print(len(krediler)) #length ekrana kaç tane eleman olduğunu yazdırır.

krediler[0] = "Çabuk kredi" #kredinin 0. elemanını değiştir.
print(krediler)
print(krediler[0])

#print(krediler[5]) #hata verir.

########################################

mesaj = "Merhaba Dünya"

print(mesaj[2])        # R harfini verir
print(mesaj[2:5])      # 2 den 5'e kadar olan harfleri verir.

yeniMesaj = mesaj[:5]  # 5'e kadar olan harfleri verir.
print(yeniMesaj)

#len

print(len(mesaj))

yeniMesaj2 = mesaj[len(mesaj)-1:len(mesaj)] 

print(yeniMesaj2)

#lower ve upper

print(mesaj.upper())       #Büyük harflere çevirir
print(mesaj.lower())        #Küçük harflere çevirir

#replace

print(mesaj.replace("ü","u"))
print(mesaj)

mesaj = mesaj.replace("ü","u")  #mesaj tanımını sürekli değiştirmek için
print(mesaj)

print(mesaj.replace("a","e"))

#split ve strip

bilgi = " Ömer Faruk Özmen 21 Kars "
print(bilgi.split())                    #default olarak boşluklardan ayırır.
print(bilgi.split(" "))

bilgi = " Ömer;Faruk;Özmen;21;Kars ".strip()    #boşlukları otomatik olarak ayırır.
print(bilgi.split())                    
print(bilgi.split(";"))
print(bilgi.split(";")[0])                #ayır ve 0.elemanı getir
print("Adı = " + bilgi.split(";")[0])



#input

ad = input("Adınız?")
sayi1 = input("Sayı 1 =?")
sayi2 = input("Sayı 2 =?")
print(int(sayi1)+int(sayi2))


#listeler

ogrenci1 = "Ömer"
ogrenci2 = "Faruk"
ogrenci3 = "Ahmet"

print(ogrenci1)
print(ogrenci2)


#yerine

ogrenciler = ["Ömer","Faruk","Ahmet"]
print(ogrenciler[1])

# yeni öğrenci eklemek için

ogrenciler.append("Veli")
print(ogrenciler)

#öğrenci silmek için

ogrenciler.remove("Faruk")
print(ogrenciler)

#öğrencilerin yerini değiştirmek için

ogrenciler[0] = "Ahmet"
print(ogrenciler)


#list constructor

sehirler = list(("Ankara", "İstanbul","Kayseri"))
print(sehirler)
print(len(sehirler))   #lenght uzunluk

#diğer fonksiyonlar

print(sehirler.clear())        #celar yapınca tüm değerler silinir
print(sehirler)

sehirler = list(("Ankara", "İstanbul","İzmir","Ankara"))

#Ankara'nın kaç kez bulunduğunu gösterir.
print("Ankara sayısı = " + str(sehirler.count("Ankara"))) 

#Ankara'nın kaçıncı indexte olduğunu gösterir.
print("Ankara indexi = " + str(sehirler.index("Ankara")))

#1.indexi çıkarır.
sehirler.pop(1)

#0. indexe İstanbulu ekler.
sehirler.insert(0,"İstanbul")
print(sehirler)

#indexleri tersine çevirir.
sehirler.reverse()
print(sehirler)

#sehirler'i sehirler3'e kopyalıyoruz.
sehirler3 = sehirler.copy()

#diziler referans tiptir.
sehirler2 = sehirler
sehirler2[0]="İzmir"
print(sehirler)
print(sehirler2)
print(sehirler3)

#iki listeyi birbirine bağlar
sehirler.extend(sehirler3)
print(sehirler)

#listeyi A-Z sıralama yapar
sehirler.sort()
print(sehirler)

#A-Z sıralanmış listeyi Z-A ya sıralar
sehirler.reverse()
print(sehirler)
