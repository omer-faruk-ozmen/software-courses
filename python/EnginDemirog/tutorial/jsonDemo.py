import json

#json dosyasını okumak için.
with open("users.json") as users1:
    data = json.load(users1)
    #belli bir yere kadar verilere ulaşmak için for döngüsüne alıyoruz.
    for x in range(5):
        print(data[x]["username"])
        print(data[x]["email"])
        print(data[x]["address"]["street"])
        print(data[x]["address"]["geo"]["lat"])
    
