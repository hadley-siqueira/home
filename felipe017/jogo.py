import random

print('jogo da adivinhação') 
v = random.randint(0, 100)
 
while True:
    n = int(input('digite um numero: '))
    if n > v:
        print('voce errou, o numero eh menor')
    elif n < v:
        print('voce errou, o numero eh menor')
    else:
        print('parabens, vc acertou')
