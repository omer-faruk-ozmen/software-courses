"""
import matematikModule

matematikModule.topla(2,4)
matematikModule.carp(2,3)


#farklı isimlendirmek için as'den sonra yeni ismi tanımlarız.
import matematikModule as mm

mm.carp(3,4)

print(mm.customer["firstName"])

"""
#modülden sadece bir fonksiyonu çağırmak için from kullanılır.
from matematikModule import topla

topla(3,5)

from matematikModule import customer

print(customer["lastName"])