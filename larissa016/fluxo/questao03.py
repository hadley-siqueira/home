n1 = int(input("digite o primeiro numero: "))
n2 = int(input("digite o segundo numero: "))
n3 = int(input("digite o terceiro numero: "))

if n1 > n2:
    if n1 > n3:
        print("O maior numero é:" + str(n1))
    else:
        print("O maior numero é:" + str(n2))
else:
    if n2 > n3:
        print("O maior numero é:"+ str(n2))
    else:
        print("O maior numero é:" + str(n3))
