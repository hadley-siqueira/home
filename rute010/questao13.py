print("**Calculadora de Plano**")

x1 = int(input("Informe o valor de x1:"))
y1 = int(input("Informe o valor de y1:"))
x2 = int(input("Informe o valor de x2:"))
y2 = int(input("Informe o valor de y2:"))

sub1 = x2 -x1
sub2 = y2 - y1

q1 = sub1 * sub1
q2 = sub2 * sub2

soma = (q1 + q2) ** 0.5

print( )
print("A distancia euclidiana entre os pontos eh:" + str(soma))
