n1 = int(input("Digite o primeiro número: "))
n2 = int(input("Digite o segundo número: "))
n3 = int(input("Digite o terceiro número: "))

if n1 + n2 == n3:
    print("A soma do primeiro e do segundo número é resultado do terceiro")
else:
    if n2 == n1 + n3:
        print("A soma do primeiro e do terceiro número é o resultado do segundo")
    else:
        print("A doma do segundo e terceiro número é o resultado do primeiro")
