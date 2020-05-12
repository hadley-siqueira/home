print('*** Consoantes ***')

v_char = []
v_vog = ['a', 'e', 'i', 'o', 'u']
v_numeros = ['1', '2', '3', '4', '5', '6', '7', '8', '9']
cons = 0 

for c in range(0 , 10, +1):
    let = str(input('Digite a letra desejada: '))
    while let[0] in v_numeros:
        print('Você digitou um número, digite novamente')
        let = str(input('Digite a letra desejada: '))
    v_char.insert(c, let.lower())
    if let.lower() not in v_vog:
        cons += 1

print(v_char)
print('Quantidade de consoantes: ' + str(cons))

for c in range(0, 10, +1):
    if v_char[c] not in v_vog:
        print(v_char[c], end = ' ')
print()

