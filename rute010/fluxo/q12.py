p1 = input("Digite o primeiro produto:")
pp1 = float(input("Digite o preço do primeiro produto:"))
p2 = input("Digite o segundo produto:")
pp2 = float(input("Digite o preço do segundo produto:"))

if pp1 > pp2:
    print("O produto mais caro é " + str(p1))
elif pp1 == pp2:
    print("Os produtos tem o mesmo preço")
else:
    print("O produto mais caro é " + str(p2))

