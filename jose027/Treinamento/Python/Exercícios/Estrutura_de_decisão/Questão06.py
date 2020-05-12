print('*** Maior número ***')

n1 = int(input('Digite o primeiro número: '))
n2 = int(input('Digite o segundo número: '))
n3 = int(input('Digite o terceiro número: '))

if n1 > n3 and n1 > n2:
    print('Maior número: ' + str(n1))
elif n2 > n3 and n2 > n1:
    print('Maior número: ' + str(n2))
elif n3 > n2 and n3 > n1:
    print('Maior número: '+ str(n3))
