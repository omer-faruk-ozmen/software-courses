demet = (1,2,3,4,5,6,7)

print(type(demet))
print(demet[3])
print(demet[-1])
print(demet[:4])
print(demet[::-1])

"""      METODLAR          """
demet2 = (1,1,2,3,4,4,5,6)

#count fonksiyonu. demet içinde kaç defa geçtiğini söyler.
print(demet2.count(1))
print(demet2.count(2))
print(demet2.count(9))

#index fonksiyonu. verinin kaçıncı index te olduğunu söyler.
print(demet2.index(1))
print(demet2.index(3))