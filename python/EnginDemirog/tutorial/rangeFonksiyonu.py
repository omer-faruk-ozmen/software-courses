sehirler = ["Ankara","İstanbul","İzmir"]

#%% For İntro
for sehir in sehirler: 
     if sehir == "İstanbul":
        continue
    print(sehir + " için kod = " + sehir[0:3])
    print("*********")

#%% For range

# range den sonra ilk sayı kaçtan başlayacağı
# ikinci sayı kaça kadar sayacağı
# üçüncü sayı ise artış miktarı
for x in range(0,100,2):
    print(x+1)


# %%


#    #%% projede belli bir kısmı çalıştırmak için kullanılır