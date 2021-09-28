print("""****************
Kullanıcı Girişi
****************
""")

sys_kullanici_adi = "mmurat"
sys_parola = "12345"

kullaniciAdi = input("Kullanıcı Adı: ")
parola = input("Parola: ")

if (kullaniciAdi == sys_kullanici_adi and sys_parola != parola):
    print("Parola Hatalı...")
elif (kullaniciAdi != sys_kullanici_adi and sys_parola == parola):
    print("Kullanıcı adı hatalı...")
elif(kullaniciAdi != sys_kullanici_adi and parola != sys_parola):
    print("Kullanıcı adı ve parola hatalı")
else:
    print("sisteme başarıyla giriş yapıldı.")












