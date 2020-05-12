print('*** Maior dos números ***')
numeros = [] 

for c in range(0, 5, + 1):
    n = int(input('Digite o número desejado: '))
    numeros.insert(c, n)

print(numeros)
print('Maior número: ' + str(max(numeros)))
