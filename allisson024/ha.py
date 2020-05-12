nome = input('Digite seu nome: ')
idade = int(input('Digite sua idade: '))

if idade >= 18:
	print('{}, voce ja eh um adulto'.format(nome))
else:
	print('{}, voce ainda nao eh um adulto'.format(nome))
