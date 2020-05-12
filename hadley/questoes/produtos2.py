n1 = input('Digite o nome do primeiro produto: ')
p1 = float(input('Digite o preco do primeiro produto: '))
n2 = input('Digite o nome do segundo produto: ')
p2 = float(input('Digite o preco do segundo produto: '))

if p1 > p2:
    print('Produto mais caro: ' + n1)
elif p2 > p1:
    print('Produto mais caro: ' + n2)
else:
    print('Os dois produtos custam o mesmo preco')
