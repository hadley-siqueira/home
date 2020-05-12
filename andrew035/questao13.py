print("** Distância euclidiana **")

x1 = float(input("Digite a localização x1: "))
y1 = float(input("Digite a localização y1: "))

x2 = float(input("Digite a localização x2: "))
y2 = float(input("Digite a localização y2: "))

sub1 = x2 - x1
sub2 = y2 - y1

q1 = sub1 **2
q2 = sub1 **2

distancia = q1 + q2

print("Distância euclidiana entre os pontos: " + str(distancia))
