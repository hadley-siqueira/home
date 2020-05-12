print('** Distancia euclidiana **')

x1 = float(input("Digite a localizacao x1: "))
y1 = float(input("digite a localizacao y1: "))

x2 = float(input("digite a localizacao x2: "))
y2 = float(input("digite a localizacao y2: "))

sub1 = x2 - x1
sub2 = y2 - y1

q1 = sub1 **2
q2 = sub2 **2

distancia = q1 + q2

print("Distancia euclidiana entre os pontos: " + str(distancia))



