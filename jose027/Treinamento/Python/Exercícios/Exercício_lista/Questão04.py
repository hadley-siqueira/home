print('*** Número pars e ímpares ***')

vet = [] 
vet_par = []
vet_impar = []

for c in range(0, 20, +1):
    n = int(input('Digite o número desejado: '))
    vet.append(n)
    if n % 2 == 0:
        vet_par.append(n)
    else:
        vet_impar.append(n)

print('** Vetor *** \n' + str(vet))
print('** Vetor par *** \n' + str(vet_par))
print('** Vetor impar *** \n' + str(vet_impar))
