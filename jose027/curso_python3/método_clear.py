print('Método clear')
print('opções')
print('*** l1 ***')
print('[1,2,3,4,5,6,7]')
print('*** l2 ***')
print('[100, 200, 300, 400, 500]')

listas = str(input('Digite a lista desejada: '))

l1 = [1, 2, 3, 4, 5, 6, 7]
l2 = [100, 200, 300, 400, 500]

if listas == 'l1':
    l1.clear()
    print(str(l1))
elif listas == 'l2':
    l2.clear()
    print(str(l2))
else:
    print('A lista digitada não está presente nas opções disponíveis') 
