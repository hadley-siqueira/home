x0 = float(input(" Digite a coordenada X do primeiro ponto: "))
y0 = float(input(" Digite a coordenada Y do primeiro ponto: "))
x1 = float(input(" Digite a coordenada X do segundo ponto: "))
y1 = float(input(" Digite a coordenada Y do segudo ponto: "))

d = ((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0)) ** 0.5

print(d)

