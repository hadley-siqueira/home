import math

px = int(input("Informe a coordenada x círculo: "))
py = int(input("Informe a coordenada y círculo: "))
r = int(input("Informe o raio do círculo: "))
qx = int(input("Informe o coordenada x do ponto: "))
qy = int(input("Informe o coordenada y do ponto: "))

raiz = (px - qx) ** 2 + (py - qy) ** 2

dist = math.sqrt(raiz)

if dist > r:
    print("O ponto está fora do círculo")
else:
    print("O ponto está dentro do círculo")


