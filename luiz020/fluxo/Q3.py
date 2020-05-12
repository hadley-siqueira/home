n1 = int(input("Digite o primeiro número: "))
n2 = int(input("Digite o segundo número: "))
n3 = int(input("Digite o terceiro número: "))

if n1 > n2: 
    if n1 > n3:
        print("O maior número eh " + str(n1))

    else:
        if n3 > n1:
            print("O maior número eh " + str(n3))

else: 
    if n2 > n3:
        print("O maior número eh " + str(n2))

    else:
        if n3 > n2:
            print("O maior número eh " + str(n3))
