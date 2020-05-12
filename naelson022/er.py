print("  programa adivinhador  ")
print("digite tres nimeros e eu vou dizer qual deles eh o maior")
n1 = int(input("digite o primeiro numero: "))
n2 = int(input("digite o segundo  numero: "))
n3 = int(input("digite o terceiro  numero: "))
if n1 > n2:
    if n1 > n3:

        print("o maior numero eh o" + str(n1))
    else:
        print("o maior eh o " + str(n3))
            
else:
    if n2 > n3:
        print("o maior numero eh o " + str(n3))
        print (" o maior numero eh o " + str(n2))
    else:
        print("O maior numero eh o" + str(n3)) 
resp = input("Acertei ? ")
if resp == "sim":
    print("Aee")
else:
    print("ihhh, to mal")
