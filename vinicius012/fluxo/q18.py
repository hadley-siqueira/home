import math
cx = float(input("Digite a coordenada cx: "))
cy = float(input("Digite a coordenada cy: "))
px = float(input("Digite a coordenada px: "))
py = float(input("Digite a coordenada py: "))
r = float(input("Digite o raio: "))
dist = math.sqrt((cx - cy) * (cx - cy) + (px - py) * (px - py))

if dist > r:
    print("O ponto esta fora")
else:
    print("O ponto esta dentro")

