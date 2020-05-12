    p1 = str(input("Digite o nome do primeiro produto:"))
v1 = float(input("Digite o preço do primeiro produto:"))
p2 = str(input("Digite o nome do segundo produto:"))
v2 = float(input("Digite o preço do segundo produto:"))
if v1 > v2: 
    print("O mais caro é: " + p1)
elif v1 == v2:
    print("O preço é igual")
else:
    print(" O mais caro é:" + p2)

