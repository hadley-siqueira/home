import math

r  = float(input('Digite o raio do circulo: '))
cx = float(input('Digite a coordenada cx: '))
cy = float(input('Digite a coordenada cy: '))
px = float(input('Digite a coordenada px: '))
py = float(input('Digite a coordenada py: '))

d = math.sqrt((cx - px) ** 2 + (cy - py) ** 2)

if d > r:
    print('O ponto esta fora do circulo')
else:
    print('O ponto esta dentro do circulo')

