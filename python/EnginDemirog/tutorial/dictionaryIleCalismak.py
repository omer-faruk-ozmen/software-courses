
sozluk = {
    "book" : "kitap",
    "table" : "masa",
    "door" : "kapı"
}
 

#sözlük tanımının başka bir yolu
sozluk2 = dict(kitap = "book", masa = "table")

sozluk["book"] = "kitap 1"
print(sozluk["book"])

#sözlüğe yeni bir değer eklemek için
sozluk["pencil"] = "kalem"
print(sozluk)

#sözlükten bir değer silmek için
del(sozluk["book"])
print(sozluk)
print(len(sozluk))




#sözlüğe sorma yolu :)
ingilizcesi = input(str("Kelime?"))

print(sozluk[ingilizcesi])

