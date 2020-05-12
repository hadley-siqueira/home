n1 = str(input("Informe o primeiro produto: "))
n2 = float(input("Informe o preço do primeiro produto: "))
n3 = str(input("Informe o segundo produto: "))
n4 = float(input("Informe o preço do segundo produto: "))


if n2 > n4:
    print("O produto mais caro: " + n1)

elif n2 == n4:
    print("Os produtos tem o mesmo preço")
else:
    print("O produto mais caro: " + n3)
    
