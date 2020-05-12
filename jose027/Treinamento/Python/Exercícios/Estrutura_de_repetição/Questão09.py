print('*** Tabuada ***')
n = int(input('Digite o número desejado: '))

for c in range(1, 11, +1):
    print(str(n) + ' X ' + str(c) + ' = ' + str(n * c))
