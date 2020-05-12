n1 = int(input("Informe o primeiro número: "))
n2 = int(input("Informe o segundo número: "))
n3 = int(input("Informe o terceiro número: "))
if n1 < n2:
    if n1 < n3:
        print("O menor é " + str(n1))
    else:
        print("O menot é " + str(n3))
else:
    if n2 < n3:
        print("O menor é " + str(n2))
    else:
        print("O menor é " + str(n3))
