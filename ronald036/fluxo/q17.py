import math
rx = int(input("Digite a coordenada:"))
ry = int(input("Digite outra coordenada:"))
sx = int(input("Digite mais uma coordenada:"))
sy = int(input("Digite mais outra coordenada:"))
raio = int(input("digite o seu raio:"))
espaço = math.sqrt((rx - sx) * (rx - sx) + (ry - sy) * (ry - sy))
if espaço < raio:
    print("o ponto ta dentro do circulo")
else:
    print("o ponto não ta dentro do circulo")
