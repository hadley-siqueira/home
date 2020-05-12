import math

r = int(input("Digite o raio do circulo:"))
cx = int(input("Digite a coordenada cx:"))
cy = int(input("Digite a coordenada cy:"))
px = int(input("Digite a coordenada px:"))
py = int(input("Digite a coordenada py:"))

dist = math.sqrt(((cx - cy) * (cx - cy) + (px - py) * (px - py)))

if dist > r:
    print("O ponto esta fora do circulo")
else:
    print("O ponto esta dentro do circulo")

