n1 = str(input("Digite um produto: "))
p1 = int(input("Informe o preco desse produto: "))
n2 = str(input("Digite outro produto: "))
p2 = int(input("Informe o preco desse produto: "))

if p1 > p2:
    print("o produto mais caro e o " + str(n1))
else:
    if p1 < p2:
        print("o produto mais caro e o " + str(n2))
    else:
        if p2 == p1:
            print("os produtos possuem o mesmo preco")

