import sqlite3

def selectOperasyon():

    connection = sqlite3.connect("chinook.db")

    #database sorgusu için. * tümünü getirir.
    cursor = connection.execute("select * from customers")

    #select'ten sonra FirstName,Lastname yazılır ise sadece bu iki kolonu getirir.
    cursor = connection.execute("select FirstName,LastName from customers")

    #belli bir şarta bağlı veri çekmek için where kullanılır.
    # iki şartı eklemek için 'or' eklenir (veya)
    #alfabetik olarak sıralamk için order by kullanılır.
    #tersten alfabetik olarak sıralamak için "desc" kullanılır.
    #FirsName,Lastname : isime göre sırala aynı ise soyisme göre sırala demektir.
    #cursor = connection.execute("""select FirstName,LastName 
    #from customers where city='Prague' or city='Berlin'
    #order by FirstName,Lastname desc""")

    #for row in cursor:
    #   print("First Name = "+row[0])
    #   print("Last Name = "+row[1])
    #  print("***********")


    #order by en sona yazılır.
    #1 den büyük olanları sıralamk için havind kullanılır.
    # cursor = connection.execute("""select city,count(*) 
    # from Customers group by city having count(*)>1 
    # order by count(*) desc""")

    # for row in cursor:
    #     print("City = "+row[0])
    #     print("Count = "+str(row[1]))
    #     print("***********")



    #içinde geçen belli kelimeleri aramak için like ve %x% gibi kullanılır
    cursor = connection.execute("""select FirstName,LastName 
    from customers where FirstName like '%ja' """)


    for row in cursor:
        print("First Name = "+row[0])
        print("Last Name = "+row[1])
        print("***********")



    connection.close()


selectOperasyon()

 #veritabanına veri yazma.
def insertCustomer():
    connection = sqlite3.connect("chinook.db")
    connection.execute("""insert into customers 
    (firstName,lastName,city,email) 
    values('Ömer Faruk','Özmen','Kars','omerfarukozmen@gmail.com')""")

    connection.commit()
    connection.close()

#insertCustomer()


#veritabanı güncelleme işlemi
def updateCustomer():
    connection = sqlite3.connect("chinook.db")
    connection.execute("""update customers set city='İstanbul' 
    where city='Kars'""")

    connection.commit()
    connection.close()

#updateCustomer()


#veritabanındaki datanın silinmesi işlemi
def deleteCustomer():
    connection = sqlite3.connect("chinook.db")
    connection.execute("""Delete from customers 
    where city='İstanbul' or country=''""")

    connection.commit()
    connection.close()

#deleteCustomer()




#sqplite verilerini daha düzenli hale getirmek için.
def joinOperasyon():

    connection = sqlite3.connect("chinook.db")
    cursor = connection.execute("""select albums.Title, 
    artists.Name from artists inner join albums
on artists.ArtistId = albums.ArtistId""")

    for row in cursor:
        print("Title Name = "+row[0]+" Name = "+row[1])
        print("***********")
    connection.close()

#joinOperasyon()