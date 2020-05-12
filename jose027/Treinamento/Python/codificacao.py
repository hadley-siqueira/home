import struct
print('*** Codificação ***')

nome = str(input('Digite o nome desejado: '))
idade = int(input('Digite a idade desejada: '))
peso = float(input('Digite o seu peso: '))

print('** Dados **')
print('Nome: ' + str(nome) + '\n Idade: ' + str(idade) + '\n Peso: ' + str(peso))

print('** Dados codificados **')
d_cod =  struct.pack('  ' + str(len(nome)) + 's I f', nome.encode(), idade, peso)
print(d_cod)

print('** Dados decodificados **')
d_decod =  struct.unpack('  ' + str(len(nome)) + 's I f', d_cod)
#nome_decod = d_decod[0].decode()
print(d_decod)

