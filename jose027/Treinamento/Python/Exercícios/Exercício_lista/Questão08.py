print('*** Vetores intercalados ***')

vet1 = []
vet2 = []
vet3 = []

print('*** Primeiro vetor ***')
for c in range(0, 10, +1):
    n = int(input('Digite o número desejado: '))
    vet1.append(n)

print('*** Segundo vetor ***')
for c in range(0, 10, +1):
    n = int(input('Digite o número desejado: '))
    vet2.append(n)

for c in range(0, 10, +1):
    vet3.append(vet1[c])
    vet3.append(vet2[c])

print('*** Primeiro vetor ***')
print(vet1)

print('*** Segundo vetor ***')
print(vet2)

print('*** Tercceiro vetor ***')
print(vet3)
