import json

data = '{"firstName":"Ömer Faruk","lastName":"Özmen"}'

#datayı json formatına çevirme
y = json.loads(data)

print(y["firstName"])
print(y["lastName"])

#sözlükleri json formatına çevirmek için
customer = {
    "firstName":"Ömer Faruk",
    "lastName":"Özmen",
    "email":"omerfarukozmen@gmail.com"
    }

customerJson = json.dumps(customer)

print(customer)

print(json.dumps("Omer"))

