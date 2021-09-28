sozluk1 = {"bir":1,"iki":[[1,2],[3,4],[5,6]],"üç":3}


print(sozluk1)

print(sozluk1["bir"])

sozluk1["beş"] = 5

print(sozluk1)
print(sozluk1["iki"][0])


#sözlük güncelleme
sozluk1["beş"] = 10
print(sozluk1["beş"])

#keys. anahtarlar
print(sozluk1.keys())

#values. değerler
print(sozluk1.values())

#items. anahtar ve değerler karşılıklı olarak gelir.
#print(sozluk1.items())

for k,v in sozluk1.items():
    print(k,v)