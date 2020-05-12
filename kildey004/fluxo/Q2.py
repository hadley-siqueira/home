n1 =float(input("Digite o primeiro numero: "))
n2 = float(input("Digite o segundo numero: "))

if n1 == n2:
    print("Os numeros sao iguais")
else:
    if n1 < n2:
        print ("O menor numero eh: " + str(n1))
    else:
        print ("O menor numero eh: " + str(n2))

