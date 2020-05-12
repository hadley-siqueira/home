print('*** Multiplicação e soma ***')

vet_num = []
mult = 1

for c in range(0, 5, +1):
    n = int(input('Digite o número desejado: '))
    vet_num.append(n)
    mult *= n

print('Soma: ' + str(sum(vet_num)))
print('Multiplicação: ' + str(mult))
print(vet_num)
    
    
