print('Comparação de listas')

lista1 = [1,2,3,4,5,6,7,8,9]
lista2 = [1,2,4,4,5,6,7,8,9]

print('*** lista1 ***')
print(str(lista1))
print('*** lista2 ***')
print(str(lista2))

if lista1 > lista2:
    print('A lista1 é maior do que a lista2')
elif lista1 == lista2:
    print('A lista1 é igual a lista2') 
else:
    print('A lista2 é maior do que a lista1') 
