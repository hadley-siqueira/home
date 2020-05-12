import math

rc = int(input("Digite o raio do circulo:"))
rc = int(input("Digite a coordenada cx:"))
cy = int(input("Digite a coordenada cx:"))
px = int(input("Digite a coordenada px:"))
py = int(input("Digite a coordenada py:"))


dist = math.sqrt((cx - cy) * (cx - cy) + (px - py) * (px - py))

if dist > rc:
    print("O ponto esta fora do circulo")
else:
    print("O ponto esta dentro do circulo")
