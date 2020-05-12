a1 = str(input("Digite o nome do primeiro produto:"))
b1 = float(input("Digite o preço do primeiro produto:"))
a2 = str(input("Digite o nome do segundo produto:"))
b2 = float(input("Digite o preço do segundo produto:"))

if b1 > b2:
    print("O mais caro é: " + a1)
elif b1 == b2:
    print("O preço é igual:")
else: 
    print("O mais caro é: " + a2) 
