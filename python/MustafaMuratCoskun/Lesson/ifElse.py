
yas = int(input("Yaşınızı Giriniz."))

if yas < 18:
    print("Mekana Giremezsiniz!")
else:
    print("Mekana Hoşgeldiniz.")


note = float(input("Notunuzu giriniz."))

if (note >=90):
    print("AA")
elif (note >=85):
    print("BA")
elif (note >=80):
    print("BB")
elif (note >=75):
    print("CB")
elif (note >=70):
    print("CC")
elif (note >=65):
    print("DC")
elif (note >=60):
    print("DD")
elif (note <60):
    print("Kaldınız")
else:
    print("Lütfen geçerli bir not giriniz.")


getAccess = False

if (not getAccess):
    print("Giremezsiniz")
else:
    print("İzin verildi.")