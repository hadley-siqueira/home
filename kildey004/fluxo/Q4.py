n1 = float(input("Digite o primeiro numero: "))
n2 = float(input("Digite o segundo numero: "))
n3 = float(input("Digite o terceiro numero: "))


if n1 == n2 and n2 == n3:
    print("Os numeros sao iguais")
else:
    if n1 < n2 and n2 < n3:
        print(" O menor numero eh "+ str(n1))
    else:
        if n2 < n1 and n1 < n3:
            print("O menor numero eh: " + str(n2))
        else:
            print("O menor numero eh: " + str(n3))


