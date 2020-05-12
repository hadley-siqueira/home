n1 = int(input('digite a primeira nota: '))
n2 = int(input('digite a segunda nota: '))
n3 = int(input('digite a terceira nota: '))
n4 = int(input('digite a quarta nota: '))
p1 = int(input('digite o primeiro peso: '))
p2 = int(input('digite o segundo peso: '))
p3 = int(input('digite o terceiro peso: '))
p4 = int(input('digite o quarto peso: '))

nota_geral = n1 * p1 + n2 * p2 + n3 * p3 + n4 *p4 / p1 + p2 + p3 + p4
print('sua nota ponderada é: ' + str(nota_geral))
