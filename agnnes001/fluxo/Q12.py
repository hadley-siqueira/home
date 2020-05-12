x1 = input("Informe o primeiro produto:")
p1 = float(input("Informe o preço do primeiro produto:"))

x2 = input("Informe o segundo produto:")
p2 = float(input("Informe o preço do segundo produto:"))

if p1 > p2:
    print("O produto mais caro é " + (x1))
else:
    if p2 > p1:
        print("O produto mais caro é " + (x2))
    else:
        print("Os dois produtos tem o mesmo preço")


