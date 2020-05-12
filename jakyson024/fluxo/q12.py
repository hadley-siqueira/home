p1 = str(input('digite o nome do primeiro: '))
pp1 = float(input('digite o valor do primeiro produto'))
p2 = str(input('digite o nome do segundo produto: '))
pp2 = float(input('digite o valor do segundo produto: '))

if pp1 > pp2:
    print(' o produto mais caro eh ' + str(p1))
elif pp1 == pp2:
    print(' os produtos sao do mesmo valor')
else:
    print(' o produto mais caro eh '+ str(p2))
