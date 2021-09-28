# in operatörü ile doğrulama yapılır

a = [1,2,3,4]
print(5 in a)

b = [1,2,3,4,5]
print(2 in b)

c = (1,2,3,4)
print(not 5 in c)

"""          FOR DÖNGÜSÜ              """
liste = [1,2,3,4,5,6]
for eleman in liste:
    print(eleman)

liste1 = (1,2,3,4,5,6)
for i in liste1:
    print(i)


#her elemanı kendi içinde toplamak için
toplam = 0
for topla in liste:
    toplam = toplam + eleman
    print("Toplam: {} Eleman: {}".format(toplam,topla))
print(toplam)

#çift sayıları bulma.
liste2 = [1,2,3,4,23,54,46,34]
for cift in liste2:
    if cift % 2 == 0:
        print(cift)

s = "Python"

for karakter in s:
    print(karakter)
for a in s:
    print(a*3)

#demetlerde dolaşma
demet = (1,2,3,4,5)

for tupple in demet:
    print(tupple)

demet1 = [(1,2),(3,4),(5,6),(8,9)]
for dolas in demet1:
    print(dolas)
for (x,y) in demet1:
    print("x: {} y: {}".format(x,y))

demet3 = [(1,2,3),(4,5,6),(7,8,9),(10,11,12)]
for (x1,y1,z1) in demet3:
    print("x: {} y: {} z: {}".format(x1,y1,z1))

for (x1,y1,z1) in demet3:
    print(x1 * y1 * z1)


#sözlükler arasında dolaşma.
liste5 = [2,1,10,23,1,56,3]
total = 0
for d in liste5:
    if (not(d % 2 ==0)):
        total += d

print(total)