"""          AND          """
#hepsi true olmalı
#false başlarda olursa devamına bakmadan false çıkar

a = 1 < 2 and "Murat" == "Murat"
print(a)

b = 1 > 2 and "Murat" == "Murat"
print(b)

c = 1 < 2 and "Araba" < "Kamyon" and 4.32<5.41
print(c)

d = 1 < 2 and "Araba" > "Kamyon" and 4.32<5.41
print(d)


"""             OR            """
#herhangi birisinin true olması yeterli
#true başlarda olursa devamına bakmadan true çıkar.

e = 1 < 2 or "Murat"=="Murat"
print(e)

f = 1 < 2 or "Murat"=="Araba"
print(f)


"""              NOT                """
#işlemin sonucunun tersini alır.

g = not 2==2
print(g)

h = not "Murat"=="Araba"
print(h)
