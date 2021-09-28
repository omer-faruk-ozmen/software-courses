#operatörler. % işareti sayının bölümünden kalanı verir.
sayi = 13 % 7
print(sayi)

sayi1 = 4 % 2
print(sayi1)


#Sayı üs alma.
usSayi = 2
sayiUs = 2 ** 4
print(sayiUs)


#sayının küp kökünü alma
kupKok = 8 ** (1/3)
print(kupKok)

#sayının değerini değiştirmek için '-' kullanılır.
a = 4
print(-a)

#%%
b = ((10 **2) // 3 ) / 3
print(b)



#%%
#örnek olarak sayi çiftmi tek mi

girilenSayi = float(input("Sayıyı Giriniz."))
kalan = girilenSayi % 2
if kalan == 0:
    print(str(girilenSayi) + " Sayısı Çifttir.")
elif kalan ==1:
    print(str(girilenSayi) + " Sayısı Tektir.")
else:
    print("Lütfen tam sayı giriniz.")