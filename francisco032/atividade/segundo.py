print('Minha calculadora')
a = int (input('Digite um numero: '))
b = int (input('Digite um numero: '))
print('A soma eh {}'.format(a+b))

import random

print('Jogo da adivinhacao')
v = random.randiant(0,100)

while True:
n = int(input('Digite um numero: ' ))
if n > v:
     print('voce errou, o numero eh menor')
 elif n < v:
    print('voce errou, o numero eh maior')
 else:
    print('parabens, vc acertou!')
    break


