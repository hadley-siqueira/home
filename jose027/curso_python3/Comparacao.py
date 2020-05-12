"""
Esse algoritmo terá três tipos
de dados, mostrará o seu endereço 
de memória através do método "id",
em seguida haverá uma comparação 
entre eles.
"""
print('*** Comparação entre dados ***')
#Declaração dos dados
l1 = [1,2,3,4,5]
l2 = [1,2,3,4,5]
l3 = l1
#Amostra dos endereços de memória dos dados
print('Endereços de memória')

print('1° lista: ' + str(id(l1)))
print('2° lista: ' + str(id(l2)))
print('3° lista: ' + str(id(l3)))
#Comparação entre os dados
print('Comparação entre os dados')

print(l1 is l2)
print(l1 is l3)
print(l2 is l3)

