nome = input('digite seu nome: ')
idade = int(input('digite sua idade: '))

if idade >= 18:
	print('{}, vc ja eh um adulto'.format(nome))
else:
	print('{}, vc ainda nao eh um adulto'.format(nome))
