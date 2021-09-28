#verileri karışık olarak yazdırıyor
#en hızlı çalışan listeleme yöntemi
#var olan data değiştirilemez ama yeni bir data eklenebilir.

studentsSet = {"Engin","Derin","Salih","Ahmet"}
studentsSet2 = set("Mehmet","Veli","Ayşe")
print(studentsSet)


#daha düzenli hale getiriyoruz
for student in studentsSet:
    print(student)

#Setin içinde 'Derin' kelimesi var mı arar. True ya da False yazar.
print("Derin" in studentsSet)

if "Derin" in studentsSet:
    print("Listede var")

#setin içerisine data ekleme
studentsSet.add("Ali")
print(studentsSet)

#setin içerisine liste şeklinde data ekleme
studentsSet.update(["Esra","Mert","Selin"])
print(studentsSet)

#setin uzunluğunu görmek için
print(len(studentsSet))

#setten elemen silmek için
studentsSet.remove("Selin")
print(len(studentsSet))

#sette sileceği kişiyi bulamadığında hata vermemesi için.
#bulursa siler bulamazsa hata vermez.
studentsSet.discard("Selin")
print(len(studentsSet))

#listenin sonundaki kişiyi siler.
#kendi yaptığı sıralamaya göre son kişiyi siler. Random.
x = studentsSet.pop()
print(len(studentsSet))

#tüm seti temizlemek için
y = studentsSet.clear()
print(len(studentsSet))

#seti silmek için
del studentsSet
print(studensSet)