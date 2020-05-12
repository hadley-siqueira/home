print ("x e y sao positivos ")
x = int(input("Digite o x do primeiro vertice: "))
y = int(input("Digite o y do primeiro vertice: "))
x1 = int(input("Digite o x do segundo vertice: "))
y1 = int(input("Digite o y do segundo vertice: ")) 
x2 = int(input("Digite a coordenada x do ponto: "))
y2 = int(input("Digite a coordenada y do ponto: "))
xall =  x < x2  and x1 > x2 and y > y2 and y1 < y2 

if xall:
    print("O ponto esta dentro: ")
else:
    print("O ponto esta fora: " )
    





