a = input('Digite uma string: ')
b = int(input('Digite um inteiro: '))
c = float(input('Digite um numero real: '))

print('Voce digitou a string ' + str(a))
print('Voce digitou o numero ' + str(b))
print('Voce digitou o real ' + str(c))


if b > c:
    print('O a eh maior que b: ' + str(a) + ' > ' + str(b))
else:
    print('O b eh maior que a: ' + str(b) + ' > ' + str(a))
