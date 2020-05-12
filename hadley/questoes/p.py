n1 = int(input('Digite o primeiro numero: '))
n2 = int(input('Digite o segundo numero: '))
n3 = int(input('Digite o terceiro numero: '))

if n1 > n2:
    if n1 > n3:
        print('O maior numero eh ' + str(n1))
    else:
        print('O maior numero eh ' + str(n3))
else:
    if n2 > n3:
        print('O maior numero eh ' + str(n2))
    else:
        print('O maior numero eh ' + str(n3))
