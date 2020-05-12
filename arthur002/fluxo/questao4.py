n1 = int(input("digite o primeiro numero:"))
n2 = int(input("digite o segundo numero:"))
n3 = int(input("digite o terceiro numero:"))
if n1<n2:
    if n1<n3:
        print("o menor numero eh o:" + str(n1))
else:
    if n2<n3:
        print("o menor numero eh o:" + str(n2))
    else:
        print("o menor numero eh o:" + str(n3)) 
