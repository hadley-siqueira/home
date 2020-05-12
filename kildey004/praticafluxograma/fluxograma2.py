print (" ** Programa Adivinhar ** ")
print ("digite tres numeros e eu vou dizer qual deles eh o maior")
n1 = int(input("Digite o primeiro numero: "))
n2 = int(input("Digite o segundo numero: "))
n3 = int(input("Digite o terceiro numero: "))

if n1 > n2:
    if n1 > n3:
        print("O maior numero eh o " + str(n1))
    else: 
        print("O maior numero eh o " + str(n3))
else:
    if n2 > n3:
        print("O maior numero eh o " + str(n2))
    else: 
        print("O maior numero eh o " + str(n3))


resp = input("acertei?")


if resp == "sim":
    print("Aee")
else:
    print("ihh, to mal")
