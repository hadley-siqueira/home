n1 = int(input("Digite o primeiro numero: "))
n2 = int(input("Digite o segundo numero: "))
n3 = int(input("Digite o terceiro numero: "))

if n1 > n2 and n2 > n3:
    print("o maior numero eh o "+ str(n1))
else:
    if n2> n3:
        print ("o maior numero eh o " +str(n2))
    else:
        print("o maior numero eh o " +str(n3))

