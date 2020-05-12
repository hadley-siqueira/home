print('jogo da adivinhaçao')
q
v = random.randint(0,100) 

while True: 
n = int(input('digite um numero: '))
if n > v: 
print('voce errou, o numero e maior')
elif n < v:
print('voce errou, o numero e maior')
else:
print('parabens, vc acertou')
break 
