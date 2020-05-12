print('*** Soma dos quadrados ***')
vet = []
vet_elev = []
soma = 0

for c in range(0, 10, +1):
    n = int(input('Digite o número desejado: '))
    vet.append(n)
    soma += n ** 2
    vet_elev.append(n ** 2)

print(vet)
print(vet_elev)
print('Soma dos quadrados: ' + str(soma))
    
