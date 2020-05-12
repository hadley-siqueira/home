x = int(input("Digite o x do primeiro vértice: "))
y = int(input("Digiteo y do primeiro vértice:  "))
x1 = int(input("Digite o x do segundo vértice: "))
y1 = int(input("Digite o y do segundo vértice: "))
x2 = int(input("Digite o coordenada x do ponto: "))
y2 = int(input("Digite a coordenada y do ponto: "))

if x2 < x1 and x2 > x and y2 > y1 and y2 < y:
    print("O ponto está dentro!")
else:
    print("O ponto está fora!")

