boy = float(input("Boyunuzu Giriniz.(cm)"))
if boy>50:
    boy = boy / 100
elif boy<3:
    boy = boy 
kilo = float(input("Kilonuzu Giriniz."))

bki = (kilo) / (boy*boy)

print("BKI = {}".format(bki))