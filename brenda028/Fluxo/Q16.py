n1 = int(input("Digite um número:"))
n2 = int(input("Digite outro número:"))
n3 = int(input("Digite mais um número:"))

if n1+n2==n3 or n1+n3==n2 or n2+n3==n1:
    if n1+n2==n3:
        print("O primeiro número somado com o segundo resulta no terceiro")
    if b1+n3==n2:
        print("O primeiro número somado com terceiro resulta no segundo")
    if n2+n3==n1:
        print("O segundo número somado com o terceiro resulta no primeiro")
else:
    print("Nenhum dos números somados resultam em outros números")
