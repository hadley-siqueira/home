p1 = input("Qual o nome do primeiro produto?")
n1 = float(input("Digite o preço do primeiro produto: "))
p2 = input("Qual o nome do segundo produto? ")
n2 = float(input("Digite o preço do segundo produto: "))

if n1 > n2:
    print("O produto mais caro e: "+str(p1))
else:
    if n2 > n1:
        print(" O produto mais caro e: "+ str(p2))
    else:
        print(" Os dois produtos tem o mesmo valor")
    

