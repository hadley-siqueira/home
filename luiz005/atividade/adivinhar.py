import random

print('Jogo da Advinhacao')
v = random.randint(0, 100 )
while True:
	n = int(input('Digite um numero: '))
	if n > v:	
		print('Voce errou o numero eh menor')
	elif n < v:
		print('Voce errou o numero eh maior')
	else:
		print('Parabens, voce acertou')
		break

