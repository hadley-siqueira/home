print("numeros em ordem decrescente")
r1 = int(input("digite um numero qualquer:"))
r2 = int(input("digite um numero qualquer:"))
r3 = int(input("digite um numero qualquer:"))
if r1 < r2 and r2 < r3:
    if r1 < r2:
        print("os numeros não estão em ordem decrescente")
    else:
        print("os numeros está em ordem decrescente ")
        if r2 < r3:
            print("os numeros não estão em ordem decrescente")
        else:
            print("os numeros está em ordem decrescente")
else:
    print("os numeros está em ordem decrescente")

