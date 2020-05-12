vx = int(input("Digite a coordenada x do primeiro vertice do retangulo:"))
vy = int(input("Digite a coordenada y do primeiro vertice do retangulo:"))
vx1= int(input("Digite a coordenada x do segundo  vertice do retangulo:"))
vx2 = int(input("Digite a coordenada do y do segundo vertice do retangulo:"))
px = int(input("Digite a coordenada x do ponto:"))
py = int(input("Digite a coordenada y do ponto:"))
if px < vx and px < vy and px <vx1 and px < vx2:
    print("O ponto está dentro do retangulo")
else:
    print("O ponto está fora do retangulo")

