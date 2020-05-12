xp = int(input("Informe o x do primeiro vertice: "))
yp = int(input("Informe o y do primeiro vertice: "))
xs = int(input("Informe o x do segundo vertice: "))
ys = int(input("Informe o y do segundo vertice: "))
cxp = int(input("Informe a coordenada x do ponto: "))
cyp = int(input("Informe a coordenada y do ponto: "))

if cxp > xp  and cxp < xs:
    if cyp > yp and cyp < ys:
        print("Está dentro.")
    else:
        print("Está fora.")
else:
    print("Está fora.")
