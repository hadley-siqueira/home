n1 = int(input("Digite um número:"))
n2 = int(input("Digite outro número:"))
n3 = int(input("Digite mais um número:"))
if n1+n2==n3 or n1+n3==n2 or n2+n3==n1:
    if n1+n2==n3:
        print("O primeiro numero somado com o segundo resuta no terceiro")
    if n1+n3==n2:
        print("O primeiro numero somado com o terceiro numero resulta no segundo")
    if n2+n3==n1:
        print("O segundo numero somado com o terceiro numero resulta no primeiro")
else:
    print("Nenhum dos numeros somados resultam em os outros numeros")

