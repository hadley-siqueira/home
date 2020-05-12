print('Método remover')
print('*** opções ***')
print('*** l1 ***')
print('l1 = [1, 2, 3, 4, 5, 6, 7]')#amostra da primeira lista disponível
print('*** l2 ***')
print('l2 = [100, 200, 300, 400, 500]')#amostra da segunda lista disponível

l1 = [1, 2, 3, 4, 5, 6, 7]#primeira lista
l2 = [100, 200, 300, 400, 500]#segunda lista

listas = str(input('Digite a lista desejada disponíveis nas opções: ' ))

if listas == 'l1':
    número = int(input('Digite o número desejado que esteja dentro da lista escolhida: '))
    l1.remove(número)#método de remoção de algum valor da lista
    print(str(l1))#amostra da lista após o método ser cumprido
elif listas == 'l2':
    número = int(input('Digite o número desejado que esteja dentro da lista escolhida: '))
    l2.remove(número)#método de remoção de algum valor da lista
    print(str(l2))#amostra da lista após o método ser cumprido
else:
    print('A lista digitada não está presente nas opções disponíveis') 



