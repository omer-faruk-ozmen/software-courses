sayilar = [1,2,3,4,5]

sayilarKareli = []

#for ile yapmak için
for sayi in sayilar:
    sayilarKareli.append(sayi*sayi)

#maping yöntemi ile
sayilarKareliMap = list(map(lambda x: x**2,sayilar))

#belli bir şarta göre filtrelemek için. filter fonksiyonu kullanılır.
sayilarFiltreli = list(filter(lambda sayi : sayi>2,sayilar))


from functools import reduce
sayilarFaktoriyel = reduce(lambda x,y:x*y,sayilar)


print(sayilarKareli)
print(sayilarKareliMap)
print(sayilarFiltreli)
print(sayilarFaktoriyel)