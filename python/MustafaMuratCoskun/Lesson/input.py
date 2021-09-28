#print(input("Lütfen bir sayı giriniz."))

a = input("Lütfen bir sayı giriniz.")
print("Kullanıcının girdiği değer", a)


"""              KURALLAR            """
#input girişi her zaman str dir.
#int ya da floata çevrilir

a = int(input("Lütfen bir sayı giriniz."))
a = a * 3
print("Kullanıcının girdiği değer", a)


#%%
a = int(input("Birinci sayı"))
b = int(input("İkinci sayı"))
c = int(input("Üçüncü sayı"))

toplamları = a + b + c
print("Toplamları",str(toplamları))
# %%

#%%
#hata yönetimi
b = int(input("a: "))
print(b)
try:
    a = a = int(input("a: "))
    print(a)
except ValueError:
    print("Lütfen Sayı Giriniz.")

# %%
