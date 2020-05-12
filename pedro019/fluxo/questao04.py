p1 = int(input("Digite o primeiro numero: "))
p2 = int(input("Digite o segundo numero: "))
p3 = int(input("Digite o terceiro numero; "))

if p1 < p2:
    if p1 < p3:
        print("O menor numero e: " + str(p1))
    else:  
        print("O menor numero e: " + str(p3))
else:
    if p2 < p3:
        print("O menor numero e: " + str(p2))
    else:
        print("O menor numero e: " + str(p3))
