a = int(input("informe o primeiro numero: "))
b = int(input("informe o segundo numero: "))
c = int(input("informe o terceiro numero: "))

if a < b:
    if a < c:
        print('o menor eh ' + str(a))
else:
    if b < c:
        print('o menor eh ' + str(b))
    else:
        print('o menor eh ' + str(c))

