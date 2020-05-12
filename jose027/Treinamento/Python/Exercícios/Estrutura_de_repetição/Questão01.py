print('*** Nota ***')
nota = float(input('Digite a nota desejada: '))

while nota < 0 or nota > 10:
    print('Nota inválida, digite novamente')
    nota = float(input('Digite a nota desejada: '))

print('Nota digitada: ' + str(nota))
