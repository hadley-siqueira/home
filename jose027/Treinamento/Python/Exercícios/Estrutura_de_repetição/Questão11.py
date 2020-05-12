print('*** Números pares e ímpares')

n_pares = 0

for c in range(0, 10, +1):
    n = int(input('Digite o número desejado: '))
    if n % 2 == 0:
        n_pares += 1   

print('Números pares: ' + str(n_pares))
print('Números ímpares: ' + str(10 - n_pares))
        
