import random
print('Jogo da advinhacao')
v = random.randint(0,100)

while True:
 n = int(input('digite um numero:'))
 if n > v:
    print('Voce errou,o numero eh menor')
 elif n < v:
   print('Voce errou,o numero eh maior')
 else: print('parabens,vc acertou!')
break

