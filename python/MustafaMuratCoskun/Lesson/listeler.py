#[] ile liste oluşturmak için
liste = ["Elma","Armut",35,3.15,"Nasılsın",5]

#formul ile liste oluşturmak için
bosListe = list()

#harfleri ile yazar
listeAyırma = list("Merhaba")
print(listeAyırma)

print(liste[2])
print(liste[-1]) #son elemana ulaşır.
print(liste[:4])
print(liste[::2])
print(liste[::-1])

liste1 = [1,2,3]
liste2 = [4,5,6]
liste3 = liste1 + liste2
print(liste3)

#listeler direkt olarak değiştirilebilirler.
liste2[1] = 10
print(liste2)

#belli bir kısıma kadar değerleri değiştirme.
listeA = [1,2,3,4,5,6]
listeA[:2] = [10,11]
print(listeA)

"""                     METODLAR                     """


# Append
liste.append("Python")
print(liste)

# Pop, eğer değer verilmezse son değeri atar.
liste.pop(4)
print(liste)

# Sort
listeA.sort()
print(listeA)

##tersten sıralamak için
listeA.sort(reverse = True)
print(listeA)

#iç içe listelerde veriye ulaşmak için.
x = [[1,2],[3,4],[5,6]]
print(x[1][1])