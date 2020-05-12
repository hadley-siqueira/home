print("**Calculadora de Media Ponderada**")

p1 = float(input("Informe o primeiro peso:"))
p2 = float(input("Informe o segundo peso:"))
p3 = float(input("Informe o terceiro peso:"))
p4 = float(input("Informe o quarto peso:"))

n1 = float(input("Informe a primeira nota:"))
n2 = float(input("Informe a segunda nota:"))
n3 = float(input("Informe a terceira nota:"))
n4 = float(input("Informe a quarta nota:"))

r = (p1 * n1 + p2 * n2 + p3 * n3 + p4 * n4)/(p1 + p2 + p3 + p4)

print( )
print("O resultado da media eh:" + str (r))
