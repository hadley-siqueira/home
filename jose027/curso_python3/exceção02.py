print('*** Exceção ***')
print('Digite um número  0 >= n <= 20')

try:
    n = int(input('Digite o valor desejado: '))
    if n >= 0 and n <= 20:
        print('Valor digitado ' + str(n))
    else:
        raise ValueError
except ValueError:
    print('Valor agregado inválido')

