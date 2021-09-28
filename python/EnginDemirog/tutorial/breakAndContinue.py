sehirler = ["Ankara","İstanbul","İzmir"]
#print(sehirler[0])

for sehir in sehirler:     #sehir takma isim alias

  #break döngüyü kırar.
    if sehir == "İstanbul":
        break
    print(sehir + " için kod = " + sehir[0:3])
    print("*********")

  #continue döngüyü başa alır sadece istanbulu yazmaz
    if sehir == "İstanbul":
        continue
    print(sehir + " için kod = " + sehir[0:3])
    print("*********")

