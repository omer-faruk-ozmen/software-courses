import sys


liste = [7,'ömer',0,3,"6"]

for x in liste:
    try:
        print("Sayı: " + str(x))
        sonuc = 1/int(x)
        print("Sonuç : " + str(sonuc))
    except ValueError:
        print(str(x) +" Bir sayı değildir.")
    #sistem hatasının ne olduğunu görmek için sys.exc_info kullanırız.
    except:
        print(str(x) +" Hesaplanamadı")
        print("Sistem Hatası : " + str(sys.exc_info()[0]))
    
    # finally her işlemden sonra çalışır.
    finally:
        print("İşlemler Bitti")
