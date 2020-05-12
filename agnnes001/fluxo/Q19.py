x = int(input("Digite o x do primeiro vertice:"))
y = int(input("Digite o y do primeiro vertice:"))

x1 = int(input("Digite o x do segundo vertice:"))
y1 = int(input("Digite o y do segundo vertice:"))

x2 = int(input("Digite a coordenada x do ponto:"))
y2 = int(input("Digite a coordenada y do ponto:"))

if x2 < x1 and x2 > x and y2 > y1 and y2 < y:
    print("O ponto esta dentro")
else:
    print("O ponto esta fora")
 
