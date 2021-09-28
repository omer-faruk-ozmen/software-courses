a = "Merhaba"



print(a[3])
print(a[5])

print(a[-3])

# strinleri parçalama
# [başlama indexi, bitiş indexi, atlama değeri]
b = "Python programlama dili"

print(b[4:10])

#başlama indexi verilmezse en baştan başlar
print(b[:10])

print(b[3:])

"""başlama ve bitiş indexi verilmez ise 
atlama değerine göre atlayarak parçalar"""
print(b[::2])

#atlama değerine -1 verilir ise tersten yazdırır.
print(b[::-1])

#string uzunluğu için len fonksiyonu kullanılır.
print(len(b))

c = "Python"
print(c * 3)

x = "Ömer"
x = x + " Faruk Özmen"
print(x)

#stringlerde harfler değiştirilemez.
y = "Ahmet"
y[0] = "O"
print(y)