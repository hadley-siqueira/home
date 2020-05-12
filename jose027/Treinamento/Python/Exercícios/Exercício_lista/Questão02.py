print('*** Vetor de números reais ***')

v_num = [] 

for c in range(0, 10, +1):
    n = float(input('Digite o número desejado: '))
    v_num.insert(c, n)
print(v_num)

for c in range(len(v_num) - 1, -1, -1):
    print(v_num[c], end = ' ')
print()
