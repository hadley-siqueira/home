p1 = input("Digite o primeiro produto:")
pp1 = float(input("Digite o preco do primeiro produto:"))
p2 = input("Digite o segundo produto:")
pp2 = float(input("Digite o preco do segundo produto:"))

if pp1 > pp2:
    print("O produto mais caro eh " + str(p1))
elif pp1 == pp2:
    print("Os produtos tem o mesmo preco")
else:
    print("O produto mais caro eh " + str(p2))
