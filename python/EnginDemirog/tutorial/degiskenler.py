'''

baslik = "haberiniz olsun" #string
vade = 12 #integer
faizOrani = 1.47 #float
#Değişken ismi sayı ile başlayamaz.
#Özel karakter kullanılmaz. (_ "alt çizgi" dışında.)



print(baslik)
print(type(baslik))
print(type(vade))
print(type(faizOrani))

mesaj = "Hoşgeldin"
musteriAdi = "Ömer Faruk"
musteriSoyadi = "Özmen"
print(mesaj+" "+musteriAdi+" "+musteriSoyadi)

'''
# değişkenlerin değerini değiştirmek.

x = 10
y = 20

temp = x           #geçici değişken
x = y              # x = 10 oldu   temp = 20 oldu
y = temp            

print("x = "+ str(x))
print("y = "+ str(y))


x = 10
y = 20

x,y = y,x          #sadece pythona özel bir değiştirme yöntemidir.

print("x = "+ str(x))
print("y = "+ str(y))




