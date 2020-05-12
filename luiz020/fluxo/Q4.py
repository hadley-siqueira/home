k1 = int(input("Digite o primeiro número: "))
k2 = int(input("Digite o segundo número: "))
k3 = int(input("Digite o terceiro número: "))

if k1 < k2:
    if k1 < k3:
        print("O menor número eh: " + str(k1))

    else: 
        if k3 < k1:
            print("O menor número eh: " + str(k3))

else:
    if k2 < k3:
        print("O menor número eh: " + str(k2))

    else:
        if k3 < k2:
            print("O menor número eh: " + str(k3))
