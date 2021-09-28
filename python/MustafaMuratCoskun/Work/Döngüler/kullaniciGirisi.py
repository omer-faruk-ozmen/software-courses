print("""
*******************
Kulanıcı Girişi Programı
*******************
""")

sysKullaniciAdi = "oomer"
sysParola = "12345"
girisHakki = 3

while True:
    kullaniciAdi = input("Kullanıcı Adı: ")
    parola = input("Parola: ")
    if (kullaniciAdi != sysKullaniciAdi and parola == sysParola):
        print("Kullanıcı Adı Hatalı.")
        girisHakki -= 1
    elif (kullaniciAdi == sysKullaniciAdi and parola != sysParola ):
        print("Parola Hatalı.")
        girisHakki -= 1
    elif (kullaniciAdi != sysKullaniciAdi and parola != sysParola):
        print("Kullanıcı Adı ve Parola Hatalı.")
        girisHakki -= 1
    else:
        print("Sisteme Başarıyla Giriş Yapıldı.")
        break
    if (girisHakki == 0):
        print("Giriş Hakkınız Bitti.")
        break