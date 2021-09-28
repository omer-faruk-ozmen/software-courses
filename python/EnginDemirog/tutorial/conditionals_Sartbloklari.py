"""
dolarDun = 7.65
dolarBugun = 7.65

#if şart bloğu.
if dolarDun>dolarBugun:
    print("Azalış oku")
    print("Bitti")

if dolarDun<dolarBugun:
    print("Artış oku")

#eşittir iki tane '==' ile tanımlanır.
if dolarDun==dolarBugun:
    print("Eşittir oku")

####################################################################

#aynı şartları else ve elif ile gerçekleştirme
if dolarDun>dolarBugun:
    print("Azalış oku")
    print("Bitti")
elif dolarDun<dolarBugun:               #elif bloğu else'nin şartıdır.
    print("Artış oku")
else:
    print("Eşittir oku")

print("Bitti")

###################

sayi1 = 4
sayi2 = 6

if sayi1>sayi2:
    print(sayi1)
elif sayi1<sayi2:
    print(sayi2)
else:
    print("Sayılar eşit.")

"""



#######################################################

sayi1 = 10
sayi2 = 20

