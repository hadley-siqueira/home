import struct
print('Codificação')
#Dados que iremos empacotar
nome = 'João'
idade = 23
altura = 1.75
#Empacotamento
cod = struct.pack('4s I f', nome.encode(), idade, altura)
print(cod)
#Desenpacotamento
print('Decodificação') 
decod = struct.unpack('4s I f', cod)
print(decod)

nome = decod[0].decode()
print(nome)

