n1 = int(input(" Digite um numero:"))
n2 = int(input("Digite um segundo numero:"))
n3 = int(input("Digite um terceiro numero:"))
if n1<n2:
    if n1<n3:
        print("O menor numero é " + str(n1))
    else:
        print(" O menor numero é " + str(n3))
else:
     if n2<n3:
        print("O menor numero é " + str(n2))
     else:
        print("O menor numero é " + str(n3))

