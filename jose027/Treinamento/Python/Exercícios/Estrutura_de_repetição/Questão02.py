print('*** Cadastro ***')
nome = str(input('Digite o nome desejado: '))
senha = str(input('Digite a senha desejada: '))

while senha == nome:
    print('A senha não pode ser igual o nome, digite novamente')
    senha = str(input('Digite a senha desejada: '))

print('Nome do usuário: ' + str(nome))
print('Senha do usuário: ' + str(senha))
