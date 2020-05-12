print('*** Contagem de espaços ***')

qtd_vog = 0
vog = ['a','e','i','o','u']

f = str(input('Digite a frase desejada: '))
f.strip()

for c in range(0, len(f), + 1):
    if f[c].lower() in vog:
        qtd_vog += 1

print('A frase apresenta: ' + str(f.count(' ')) + ' espaços')
print('Quantidade de vogais: ' + str(qtd_vog))
