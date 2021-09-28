#genel olarak pythonda kullanılır diğer dillerde çok görülmez
#liste ve tuple birbirine benzer.


#tuple içinde liste, liste içinde tuple yazılabilir.
tupleListe = (2,4,6,"Ankara",(2,3,4),["İstanbul"])
liste = [2,4,6,"Ankara",[3,4,5],("İstanbul")]

liste[0]="6"
##tupleListe[0]=6 #tupple yaptıktan sonra elemanı değiştiremez.
#sadece okuma yapılabilir. Performans destekli sistemlerde kullanırız.

#tek eleman tuple string olarak algılanır.
#tuple olması için sonuna virgül koyulur.
tupleDeger =("Engin")
print(tupleDeger)
print(type(tupleDeger))



#1'den 2. indexe kadar ama 2 dahil değil
print(liste[1:2])

#tuple sonuna bir virgül koyar
print(tupleListe[1:2])



#-2 en sağdan ikinci demek.
print(liste[-2])
print(tupleListe[-2])



print(type(tupleListe))
print(type(liste))

print(tupleListe)
print(liste)
print(len(tupleListe))
print(len(liste))

