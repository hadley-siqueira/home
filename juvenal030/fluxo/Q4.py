n1 = int(input("digite o primeiro numero"))
n2 = int(input("digite o segundo numero"))
n3 = int(input("digite o terceiro numero"))

if n1 < n2:
    if n1 < n3:
        print(" n1 e o menor numero")
    else:
        if n2 < n3:
            print(" n2 e o maior numero")
        else:
            print(" n3 e o menor numero")
else:
    if n2 < n3:
            print(" n2 e o menor numero") 
    else:
            print(" n3 e o menor numero")

