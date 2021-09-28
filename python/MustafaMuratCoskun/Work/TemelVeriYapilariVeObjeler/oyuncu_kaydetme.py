print("Oyuncu Kaydetme Programı")
ad = input("Oyuncunun Adı: ")
soyad = input("Oyuncunun Soyadı: ")
takim = input("Oyuncunun Takımı: ")

bilgiler = [ad,soyad,takim]

print("\nBilgiler Kaydediliyor...\n")
print("Oyuncu Adı: {}\nOyuncu Soyadı: {}\nOyuncu Takımı: {}\n".format(bilgiler[0],bilgiler[1],bilgiler[2]))
print("Bilgiler Kaydedildi..")