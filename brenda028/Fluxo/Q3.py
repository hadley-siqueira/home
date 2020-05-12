n1 = int(input("Digite o primeiro número: "))
n2 = int(input("Digite o segundo número: "))
n3 = int(input("Digite o terceiro número: "))

if n1 > n2:
    if n1 > n3:
        print("O maior número é:" + str(n1))
    else: 
        print ("O maior número é:" + str(n3))
else:
    if n2 > n3:
        print("O maior número é:" + str(n2))
    else:
        print("O maior número é:" + str(n3))




