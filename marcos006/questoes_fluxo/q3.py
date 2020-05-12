n1 = int(input("Informe o primeiro número: "))
n2 = int(input("Informe o segundo número: "))
n3 = int(input("Informe o terceiro número: "))
if n1 > n2:
    if n1 > n3:
        print("O maior número é o primeiro!")
    else:
        if n2 > n3:
            print("O maior número é o terceiro!")
else:
    if n2 > n3:
        print("O maior número é o segundo!")
    else:
        print("O maior número é o terceiro!")
