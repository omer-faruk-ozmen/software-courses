print("Hesap Makinesi")
print("Lütfen yapmak istediğiniz işlemi seçiniz.")
print("""
İşlemler;
********************
1. Toplama
2. Çıkarma
3. Çarpma
4. Bölme
********************
""")

sayi1 = int(input("Birinci sayı: "))
sayi2 = int(input("İkinci sayı: "))
islem = input("İşemi giriniz.")

if islem == "1":
    print("{}+{}={}".format(sayi1,sayi2,sayi1+sayi2))
elif islem == "2":
    print("{}-{}={}".format(sayi1,sayi2,sayi1-sayi2))
elif islem == "3":
    print("{}*{}={}".format(sayi1,sayi2,sayi1*sayi2))
elif islem == "4":
    print("{}/{}={}".format(sayi1,sayi2,sayi1/sayi2))
else:
    print("Lütfen geçerli değer giriniz.")
