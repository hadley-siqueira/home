print('Exceção')

try:
    n = int(input('Digite o número desejado: '))
except:
    print('Tipo de dado agregado ao valor inválido')
else:
    print('Valor digitado ' + str(n))
