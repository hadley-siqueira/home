print('*** Nome em escada ***')

nome = str(input('Digite o nome desejado: '))
c = 0

while c < len(nome):
    print(nome[0: c + 1])
    c += 1
