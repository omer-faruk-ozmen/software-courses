
sayi = int(input("Sayı : "))
start = 1


if sayi<0:
    print("Negatif sayıların faktöriyeli hesaplanamaz.")
elif sayi==0:
    print("Sonuç = 1")
else:
    for i in range(1,sayi+1):
        start = start * i
    print("Sonuç : ",start)