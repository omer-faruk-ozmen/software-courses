sehirler = ["Ankara", "İstanbul", "İzmir"]

iteratorum = iter(sehirler)

#her eleman için baştan yazmaya başlıyor.
print(next(iteratorum))
print(next(iteratorum))
print(next(iteratorum))
#print(next(iteratorum)) #4.eleman olmadığı için hata verir.


#for döngüsü ilede aynı işlemi yapma.
for sehir in sehirler:
    print(sehir)