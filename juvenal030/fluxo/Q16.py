n1 = int(input("informe o primeiro numero: "))
n2 = int(input("informe o segundo numero: "))
n3 = int(input("informe o terceiro numero: "))

if n1 == n2 + n3:
    print("o primeiro numero é resultado da soma dos outros dois.")
else:
    if n2 == n1 + n3:
        print("o segundo numero é resultado da soma dos outos dois.")
    else:
        if n3 == n1 + n2:
            print("o terceiro numero é resultado da soma dos outros dois.")
        else:
            print("nemhum numero é resultado da soma de outros dois.")

