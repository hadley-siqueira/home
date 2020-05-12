x1 = input("informe o primeiro produto: ")
p1 = float(input("informe o preço do primeiro produto: "))

x2 = input("informe o segundo produto: ")
p2 = float(input("informe o preço do segundo produto: "))

if p1 > p2: 
    print("o produto mais caro é " + (x1))
else:
    if p2 > p1:
        print("o produto mais caro é " + (x2))
    else:
        print("os dois produtos tem o mesmo preço")

