print('*** Nome em escada invertida ***')

nome = str(input('Digite o nome desejado: '))
c = len(nome)

while c > 0:
    print(nome[0: c])
    c -= 1

    
