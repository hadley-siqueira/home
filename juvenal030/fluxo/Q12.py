n1 = str(input("informe o nome do primeiro produto: "))
j1 = float(input("informe o valor do primeiro produto: "))
a2 = str(input("informe o nome do segundo produto: "))
b2 = float(input("informe o valor do segundo produto: "))

if j1 > b2:
    print("o produto mais caro é o/a " + str(n1))
else:
    if b2 > j1:
        print("o produto mais é o/a " + str(a2))
    else:
        if b2 == j1:
            print("os dois produtos tem o mesmo preço")

