bx = int(input("Digite a coordenada x do primeiro vertice do  retangulo:"))
by = int(input("Digite a coordenada y do primeiro vertice do retangulo:"))
bx1 = int(input("Digite a coordenada x do segundo vertice do retangulo:"))
bx2 = int(input("Digite a coordenada y do segundo vertice do retangulo:"))
ax = int(input("Digite a coordenada x do ponto:"))
ay = int(input("Digite a coordenasa y do ponto:"))

if ax < bx and ax < by and ax < bx1 and ax < bx2: 
    print("O ponto está dentro do retangulo")
else:
    print("O ponto está fora do retangulo")
