
#hata aldığımız zaman hata yönetimi yapılır. try = dene
try:
    sayi = int(input("Sayı Giriniz = "))

#ValueError tip uyuşmazlığı hatasında çalışır.
except ValueError:
    print("Tip Uyuşmazlığı : Lütfen Sayı Giriniz.")

except ZeroDivisionError:
    print("Payda sıfır olamaz.")

#aynı anda iki hata için çalıştırmak.
except ValueError,ZeroDivisionError:
    print("Sayı Giriniz")

#except try çalışmaz ise geçerli olur. hatayı öğrenmek için
except:
    print("Bir hata oluştu")

print("Bitti")