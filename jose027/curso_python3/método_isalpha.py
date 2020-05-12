print('Método Isalpha')

nome = input('Digite o nome desejado: ') 

if nome.isalpha() == True:
    print(nome.isalpha())
    print('nome formado apenas por caracteres')
else:
    print(nome.isalpha())
    print('nome formado por caracteres e números')

