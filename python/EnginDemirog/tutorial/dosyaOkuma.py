
#eğer dosya yok ise "w" ile yeni dosya oluştururuz.(write)
#bir şey yazılmaz ise default olarak "r" gelir.(read)
#eğer "a" yazılır ise hem okuma hem yazma (append)
#"x" yazılır ise sadece dosyayı oluşturur.(create)

f = open("musteriler.txt","r")
"""
#dosyayı okumak için
print(f.read())

print("************")
#ilk on karakteri okumak için
print(f.read(10))


print("************")
#her satırı tek tek okur.
print(f.readline())
print(f.readline())
print(f.readline())

"""
#her satırı otomatik gezip döngüye almak için.
for l in f:
    print(l)

f.close


fileToAppend = open("ogrenciler.txt","a")
fileToAppend.write("\n")
fileToAppend.write("Ömer Faruk")

fileToAppend.close()

#dosyayı silmek için
import os
os.remove("ogrenciler.txt")

#%%
#dosya var mı yok mu bakmak için
if os.path.exists("ogrenciler.txt"):
    os.remove("ogrenciler.txt")
else:
    print("Dosya Yok")
# %%

#klasörü tamamen silmek için
os.rmdir("empty")