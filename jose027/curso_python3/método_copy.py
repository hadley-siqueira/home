print('       Método copy     ')
print('          opções       ')
print('       *** l1 ***      ')
print('l1 = [1,2,3,4,5,6,7]')
print('       *** l2 ***      ')
print('l2 = [100, 200, 300, 400, 500]')

listas = str(input('Digite a lista desejada: '))

l1 = [1, 2, 3, 4, 5, 6, 7]
l2 = [ 100, 200, 300, 400, 500]

if listas == 'l1':
    número = int(input('Digite o número que você deseja copiar: ')) 
    l1.copy(número) 
    print(str(l1))
elif listas == 'l2':
    número = int(input('Digite o número que você deseja copiar: ')) 
    l2.copy()
    print(str(l2))
else:
    print('A lista digitada não está presente nas opções disponíveis') 
    
