print("O maior o numero")
N1 = int(input("Informe o primeiro numero: "))
N2 = int(input("Informe o segundo numero: "))
N3 = int(input("Informe o segundo numero: "))

if N1 > N2:
    if N1 > N3:
        print('O maior numero eh: ' + str(N1))
    else:
        print('O maior numero eh: ' + str(N3))
else:
    if N2 > N3:
        print('O maior numero eh: ' + str(N2))
    else:
        print('O maior numero eh: ' + str(N3))

    
