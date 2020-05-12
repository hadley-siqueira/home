print('*** potência ***')

b = int(input('Digite a base: '))
e = int(input('Digite o expoente: '))

mult = 1

for c in range(0, e):
    mult *= b
print(mult)

