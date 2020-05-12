import math

esfera = int(input("Digite o raio:"))
cx = int(input("Digite a coordenada cx:"))
px = int(input("Digite a coordenada px:"))
py = int(input("Digite a coordenada py: "))
cy = int(input("Digite a coordenada cy:"))
resultado = math.sqrt(math.pow(px - cx , 2) + math.pow (py- cy , 2))

if resultado < esfera:
    print("O ponto esta dentro do circulo")
else:
    print("O ponto esta fora do circulo")

