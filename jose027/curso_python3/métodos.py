print('*** Listas ***')
print('*** opções ***')
print('*** l1 ***')
print('*** l2 ***')

lista = input('Digite uma das listas das opções abaixo: ')

l1 = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
l2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]

if lista == 'l1':
    print('A lista l1 tem ' + str(len(l1)) + ' valores')  
elif lista == 'l2':
    print('A lista l2 tem ' + str(len(l2)) + ' valores')  
else:
    print('A opção ' + str(lista) + ' não corresponde a nenhuma das opções disponíveis') 
