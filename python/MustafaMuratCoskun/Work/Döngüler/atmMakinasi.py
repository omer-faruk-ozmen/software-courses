print("""
**********************
ATM'ye Hoşgeldiniz.
**********************
""")



print("""
Lütfen Yapmak İstediğiniz İşlem Numarasını Giriniz.
---------------------------------------------------
1) Para Çekme
2) Para Yatırma
3) Para Gönderme
4) Hesap Bilgileri

Çıkmak İçin 'Q' ya basınız veya 'Çıkış' tuşuna basınız.

""")

hesapNumarasi = 1345233
hesapSahibiAdi = "Ömer Faruk"
hesapSahibiSoyadi = "Özmen"
telefon = "05414048256"
bakiye = 1000

while True:
    islem = input("İşlemi Seçiniz.")
    if (islem== "q" or "Çıkış"):
        print("Yine Bekleriz...")
        break
    elif (islem == "1"):
        paraCekme = int(input("Çekmek İstediğiniz Tutarı Giriniz."))
        bakiye = bakiye - paraCekme
        print("{} TL Çekildi. Kalan Bakiye {}".format(paraCekme,bakiye))
    elif(islem == "2"):
        paraYatirma = int(input("Yatırmak İstediğiniz Tutarı Giriniz."))
        bakiye = bakiye + paraYatirma
    elif (islem == "3"):
        while True:
            print("""Parayı Nasıl Göndermek İstediğinizi Seçiniz.""")
            paraIslem = input("""
            ***********************
            1) Hesap Numarası
            2) İBAN
            3) T.C numarası
            4) Geri
            ***********************
            """)
            if (paraIslem == "1"):
                paraGondermeHesap = int(input("Hesap Numarasını Giriniz."))
                hesabaGidenPara = int(input("Göndermek İstediğiniz Tutarı Giriniz."))
                bakiye = bakiye - hesabaGidenPara
                print("{} Hesap Numarasına {} TL gönderildi.\nBir Üst Menüye Yönlendiriliyorsunuz.".format(paraGondermeHesap,hesabaGidenPara))
            break
            elif (paraIslem == "2"):
                ibanNumarasi = int(input("İban Numarasını Giriniz."))
                if ((ibanNumarasi) != 16):
                    print("İban Numarası 16 Haneli Olmalıdır.")
                    break
                ibanaGidenPara = int(input("Göndermek İstediğiniz Tutarı Giriniz."))
                bakiye = bakiye - ibanaGidenPara
                print("{} İBAN Numarasına {} Tl gönderildi.\nBir Üst Menüye Yönlendiriliyorsunuz.".format(ibanNumarasi,ibanaGidenPara))
            elif (paraIslem == "3"):
                tcNumarasi = int(input("T.C. Kimlik Numarası giriniz."))
                if (len(tcNumarasi) != 11):
                    print("TC no 11 Haneli Olmalıdır.")
                    break
                tcGidenPara = int(input("Göndermek İstediğiniz Tutarı Giriniz."))
                bakiye = bakiye - tcGidenPara
                print("{} T.C. Kimlik Numarasına {} Tl Gönderilmiştir.\nBir Üst Menüye Yönlendiriliyorsunuz.".format(tcNumarasi,tcGidenPara))
            elif (paraIslem == "4"):
                print("Ana Menüye Yönlendiriliyorsunuz.")
                break
            break
        break
    elif (islem == "4"):
        print("""
        ******************
        Hesap Bilgileriniz
        ******************
        Hesap Numarası: {}
        Ad Soyad: {} {}
        Telefon: {}
        Hesap Bakiyesi: {}
        """.format(hesapNumarasi,hesapSahibiAdi,hesapSahibiSoyadi,telefon,bakiye))
        break

            

