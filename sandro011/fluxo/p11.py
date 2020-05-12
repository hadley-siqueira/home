print("informe o nome e preço dos produtos")
a = str(input('Informe o produto: '))
n = float(input('Informe o preço: '))
a2 = str(input('Informe o produto: '))
n2 = float(input('Informe o preço: '))
if n > n2:
    print('O preço maior é do produto ' + str(a))
elif n == n2:
    print('O preço dos produtos são iguais')
else:
    print('O preço maior é do produto ' + str(a2))


