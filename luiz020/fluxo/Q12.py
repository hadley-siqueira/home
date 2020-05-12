a = str(input("Digite o nome do primeiro produto: "))
b = int(input("Digite o preço do primeiro produto: "))
c = str(input("Digite o nome do segundo produto: "))
d = int(input("Digite o preço do segundo produto: "))

if b > d or b == d:
    if b > d:
        print("O primeiro produto é o mais caro")
    if b == d:
        print("Os dois produtos tem o mesmo preço")
else:
    print("O segundo produto é o mais caro")


