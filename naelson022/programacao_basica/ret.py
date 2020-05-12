x = float(input("A coordenada x do retangulo: "))
y = float(input("A coordenada y do retangulo: "))
w = float(input("O comprimento do retangulo: "))
h = float(input("A altura do retangulo: "))
xp = float(input("A coordenada x do ponto: "))
yp = float(input("A coordenada y do ponto: "))

v1 = x < xp and xp < x + w
v2 = y < yp and yp < y + h

if v1 and v2:
    print("Esta dentro")
else:
    print("Esta fora")
