"""
krediler = ["Hızlı Kredi","Maaşını Halkbank'tan alanlara özel","Mutlu emekli ihtiyaç kredisi"]



#"for" en çok kullanılan döngü türü
#başka bir döngü ise "while"

for kredi in krediler:  #"kredi" ismi 'in' den sonra gezdiği değere verilen geçici isim (alias= takma ad)
    print(kredi)


for i in range(len(krediler)): # i = alias (takma ad)
    print(krediler[i])

for i in range(3,10):   # 3'ten saymaya başla
    print(i)

for i in range(0,10,2):     # 0'dan başla 10'a kadar 2'şerli artır.
    print(i)  

    """

sehirler = ["Ankara","istanbul","İzmir"]
#print(sehirler[0])

for sehir in sehirler:     #sehir takma isim alias
    
    #tüm şehirleri alt alta basar.
    #print(sehir)
    
    #sehirlerin ilk harflerini basar
    #print(sehir[0:1])

    #sehirlerin ilk 3 harfini basar
    #print(sehir[0:3])

    #sehir kodu bastırma
    #print(sehir + " için kod = " + sehir[0:3])

    if sehir != "Ankara":
        print(sehir + " için kod = " + sehir[0:3])
        print("*********")

    

























