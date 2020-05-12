n1 = int(input("Digite o primeiro numero: "))
n2 = int(input("Digite o segundo numero: "))
n3 = int(input("Digite o terceiro numero: "))

if n1 + n2 == n3:
    print("A soma do primeiro numero mais o segundo é igual ao terceiro")
else:
    if n1 +n3 == n2:
        print("A soma do primeiro numero mais o terceiro é igual ao segundo")
    else:
        if n2 + n3 == n1:
            print("A soma do segundo numero mais o terceiro é igual ao primeiro")
        else:
            print("Nenhum dos numeros é resultado da soma de outros dois")
