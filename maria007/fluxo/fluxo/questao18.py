import math

raio = int(input("Digite o raio do circulo: "))
cx = int(input("Digite a cordenada cx: "))
cy = int(input("Digite a cordenada cy: "))
px = int(input("Digite a cordenada px: "))
py = int(input("Digite a cordenada py: "))

d = math.sqrt(((cx - cy) * (cx - cy) + (px - py) * (px - py)))

if d > raio:
    print("O ponto esta fora do circulo")
else:
    print("O ponto esta dentro do circulo")
