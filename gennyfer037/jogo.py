import random
print('jogo da adivinhaçao')
v = random.randint(0, 100)

while True:
    n = int(input('digite um numero: '))
    if n > v:
        print('voce errou, o numero eh menor')
    elif n < v:
        print('parabens, vc acertou!')
        break
