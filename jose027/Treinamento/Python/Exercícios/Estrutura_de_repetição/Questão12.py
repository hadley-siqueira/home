print('*** Números ***')

qtd_num = int(input('Digite a quantidade de números que você deseja digitar: '))
v_num = []
soma = 0

for c in range(0, qtd_num, +1):
    n = int(input('Digite o número desejado: '))
    v_num.insert(c, n)
    soma += n

print('Maior número: ' + str(max(v_num)))
print('Menor número: ' + str(min(v_num)))
print('Soma: ' + str(soma))
