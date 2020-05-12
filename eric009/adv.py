import random
for i in range(100):
	print()
print('JOGO DA ADIVINHAÇÂO')
print()
print('Tente adivinhar um número entre 0 e 1000! você tem 10 tentativas.') 
tent = 10
nome = input('Qual seu nome? \n')

n = random.randint(0,1000)
print()

while True:
	while tent > 0:
		numero = int(input('Digite um número: '))
		print(tent)
		tent = tent-1
		if numero > n:
			print('O número é menor!')
			print('Tentativas: {}'.format(tent))
			print()
		elif numero < n:
			print('O número é maior!')
			print('Tentativas: {}'.format(tent))
			print()
		else:
			print('Parabens {}, você acertou!!!'.format(n))
			tent = -1
			break	
	if tent == 0:
		print('Que pena {}, as tentativas acabaram. Mais sorte da próxima vez.'.format(nome))
		print('O número era {}'.format(n))
		break		
