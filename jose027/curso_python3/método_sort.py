print('Método sort')
print('opções')
print('*** l1 ***')
print('l1 = [0, 2, 1, 6, 3, 5, 4, 7, 19, 12, 20, 8, 9]')
print('*** l2 ***')
print('l2 = [0, 200, 100, 600, 300. 500, 400]')

listas = str(input('Digite a lista desejada: '))

l1 = [0, 2, 1, 6, 3, 5, 4, 7, 19, 12, 20, 8, 9]  
l2 = [0, 200, 100, 600, 300, 500, 400]

if listas == 'l1':
    l1.sort()
    print(str(l1))
elif listas == 'l2':
    l2.sort()
    print(str(l2))
else:
    print('A lista digitada não está presente nas opções disponíveis')   
