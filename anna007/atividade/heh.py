import random

print("Jogo da Advinhaçao")
v = random.randint(0,100)

while True:
	n = int(input("digite um numero"))
	if n < v:
		print("voce errou, o numero eh maior. o numero na vdd eh {}".format(v))

	elif n > v:
		print("voce errou o numero eh menoro, o numero na vdd eh {}".format(v))
	else:
		print("parabens. voce acertou.") 
	break
