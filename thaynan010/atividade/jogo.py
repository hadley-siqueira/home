import random
print('Jogo de adivinhacao')
v = random.randint(0, 100)

while True:
	n = int(input('Digite um numero: '))
	if n > v:
		print('voce errou, o numero eh menor')
	elif n < v:
		print('voce errou, o numero eh maior')
	else:
		print('parabens, voce acertou')
		break
 
