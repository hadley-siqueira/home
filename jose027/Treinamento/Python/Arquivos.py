print('*** Arquivos ***')

texto = str(input('Digite uma palavra ou texto desejado: '))

elementos = ['casa', 'carro', 'moto', 'bicicleta', 'capacete']

arquivo1 = open('texto.txt', 'w')
arquivo1.write(texto)

valores = []
elementos_numeros = []

for c in arquivo1:
    valores = c.split()

for cont in range (0, len(valores), +1):
    for contad in elementos:
        if valores[cont] == contad:
            elementos_numeros.insert(cont, elementos.index(contad))
    if valores[cont] not in elementos:
        elementos_numeros.insert(cont, 5)

for c in elementos_numeros:
    print(c, end = ' ')
print()
arquivo1.close()
