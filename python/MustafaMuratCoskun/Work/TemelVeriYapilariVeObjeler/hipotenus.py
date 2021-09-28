print("İşleminizi Seçiniz.")
secim = int(input("1- Dik Üçgen Kenar Bulma\n2- Hipotenüs Bulma"))

if secim==1:
    x = int(input("Kenar uzunluğu giriniz."))
    h = int(input("Hipotenüs uzunluğu giriniz."))
    kenar = ((h**2) - (x**2))**0.5
    print("Kenar Uzunluğu= {}".format(kenar))
elif secim==2:
    x = int(input("1.Kenar uzunluğunu giriniz."))
    y = int(input("2.Kenar uzunluğunu giriniz."))
    hipo = ((x**2)+(y**2))**0.5
    print("Hipotenüs= {}".format(hipo))
else:
    print("Lütfen geçerli bir seçim yapınız.")