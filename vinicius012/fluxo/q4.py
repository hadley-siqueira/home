n1 = int(input("Digite um numero: "))
n2 = int(input("Digite outro numero: "))
n3 = int(input("Digite mais um numero: "))

if n1<n2:
    if n1<n3:
        print("O menor e " + str(n1))
    else:
        print("O menor e " + str(n3))

else:
    if n2<n3:
        print("O menor numero e " + str(n2))
    else:
        print("O menor numero e " + str(n3))
