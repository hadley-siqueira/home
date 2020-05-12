print('          Método inserir             ')
print('     *** opções de listas ***        ')
print('           *** l1 ***                ')
print('   l1 = [1, 2, 3, 4, 5, 6, 7]        ')
print('           *** l2 ***                ')
print('l2 = ([100, 200, 300, 400, 500, 600, 700]')

listas = str(input('Digite a lista desejada: '))

l1 = [1, 2, 3, 4, 5, 6, 7]
l2 = [1000, 2000, 3000, 4000, 5000, 6000, 7000]

if listas == 'l1':
    índice = int(input('Digite o índice desejado: '))
    número = int(input('Digite o número desejado: '))
    l1.insert(índice, número)
    print(str(l1))
elif listas == 'l2':
    índice = int(input('Digite o índice desejado: '))
    número = int(input('Digite o número desejado: '))
    l2.insert(índice, número)
    print(str(l2)) 
else:
    print('A lista digitada não está presente nas opções disponíveis')


  



