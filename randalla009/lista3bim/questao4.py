print("Ola seja muito bem vindo")
N1 = int(input("informe o primeiro numero:"))
N2 = int(input("informe o segundo numero:"))
N3 = int(input("informe o terceiro numero:"))

if N1 < N2:
    if N1 < N3:
        print('O menor numero eh: ' + str(N1))
    else:
        print('O menor numero eh: ' + str(N3))
else:
    if N2 < N3:
        print('O menor numero eh: ' + str(N2))
    else:
        print('O maior numero eh: ' + str(N3))

