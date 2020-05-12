print('método achar')

nome = str(input('Digite o nome desejado: '))
caractere = str(input('Digite o caractere desejado para a sua pesquisa: '))

print('caractere pesquisado: ' + str(caractere))
if nome.find(caractere) == -1:
    print('O caractere ' + '"' + caractere + '"' + ' não está presente na string')
else:
    print('posição do caractere pesquisado: ' + str(nome.find(caractere) + 1))
