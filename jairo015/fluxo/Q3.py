n1 = int(input("Informe N1: "))
n2 = int(input("Informe N2: "))
n3 = int(input("Informe N3: "))

if n1 > n2:
    if n1 > n3:
        print("O maior número é: " + str(n1))
    else:
        if n2 > n1:
            if n2 > n3:
                print("O maior número é: " + str(n2))
        else:
            if n3 > n1:
                if n3 > n2:
                    print("O maior número é:"  + str(n3))
