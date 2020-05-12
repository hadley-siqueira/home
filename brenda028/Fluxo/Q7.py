n1 = int(input("Digite o primeiro número:"))
n2 = int(input("Digite o segundo número:"))
n3 = int(input("Digite o terceiro número:"))

if n1<n2:
    if n1<n3:
        print("Os números estão em ordem crescente")
    else:
        print("Os números não estão em ordem crescente")
else:
    print("Os números não estão em ordem crescente")
