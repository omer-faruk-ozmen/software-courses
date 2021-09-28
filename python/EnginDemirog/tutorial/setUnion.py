setA = {1,2,3,4,5}
setB = {1,3,5,6,7}

#setA ile setB'yi union yapma işlemleri | "altgr >< tuşu"
print(setA | setB)
print(setA.union(setB))
print(setB.union(setA))

#kesişim kümesi oluşturma yolları.(intersection)
print(setA & setB)
print(setA.intersection(setB))
print(setB.intersection(setA))

#difference ve symmetric ile çalışmak
#A fark B ya da B-A gibi
print(setA - setB)
print(setA.difference(setB)) #A'nın B'den farkı
print(setB.difference(setA)) #B'nin A'dan farkı

#Kesişimin dışında kalan kısımlar. Simetrik Fark.
#B nin A dan ve A nın B den farkını verir.
print(setA ^ setB)
print(setA.symmetric_difference(setB))
print(setB.symmetric_difference(setA))

