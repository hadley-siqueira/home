print('*** Soma dos números pares ***')
n = int(input('Digite o número de sequência desejado: '))

for c in range(n):
    print('Sequência %c: ' + str(c+1))
    núm = int(input('Digite um número da sequência: '))
    soma = 0
    while núm != 0:
        if núm % 2 == 0:
                soma += núm
    print('A soma da sequência %c é %c ' + str(c) + str(soma))
