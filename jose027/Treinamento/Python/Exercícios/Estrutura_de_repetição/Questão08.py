from time import sleep
print('*** Geração de números ***')

n1 = int(input('Digite o número desejado: '))
n2 = int(input('Digite o número desejado: '))
soma = 0

for c in range(n1 + 1, n2, + 1):
    print(c)
    soma += c  
    sleep(1)
print('Soma: ' + str(soma))
