"""
sehir = "Ankara"

print(sehir.upper())
print(sehir.endswith("a"))      #şehir a harfi ile biyiyor mu?

"""

def selamVer(isim):
    print("Merhaba " + isim)

selamVer("Engin")
selamVer("Ömer")
selamVer("Salih")

# = "dostum" yazılır ise parametre vermeden default olarak dostum yazar.
def selamVer(isim = "dostum"):
    print("Merhaba " + isim)

selamVer()


def selamVer2(isim = "Ziyaretçi", soyIsim = " arkadaş"):
    print("Merhaba " + isim + soyIsim)

selamVer2()
selamVer2("Ömer")
selamVer2("Ömer","Özmen")

#%%

def dikUcgenAlaniHesapla(a,b):
    return a*b/2

alan = dikUcgenAlaniHesapla(3,5)

print(alan)
# %%
