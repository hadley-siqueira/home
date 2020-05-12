n1 = int(input("Informe o primeiro número: "))
n2 = int(input("Informe o segundo número: "))
n3 = int(input("Informe o terceiro número: "))

if n1 == n2 + n3:
    print("O primeiro número é resultado da soma dos outros dois.")
else:
    if n2 == n1 + n3:
        print("O segundo número é resultado da soma dos outros dois.")
    else:
        if n3 == n1 + n2:
            print("O terceiro número é resultado da soma dos outros dois.")
        else:
            print("Nenhum número é resultado da soma de outros dois.")
