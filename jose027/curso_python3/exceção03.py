print('*** Exceção ***')
print('Digite um número')

try:
    n = int(input('Digite um número desejado: '))
except ValueError as Exceçao:
    print(Exceçao)
else:
    print('Número digitado ' + str(n))
