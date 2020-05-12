print("*** Calculadora para  Minerva ***")
a = int(input(" Digite o lado do cubo: "))
b = int(input(" Digite a altura do do paralelepido: "))
c = int(input(" Digite o comprimento do paralelepipedo: "))
d = int(input(" Digite a profundidade do paralelepipedo: "))
e = float(input(" Digite a base do cone: "))
f = float(input(" Digite a altura do cone: "))
g = float(input(" Digite o raio da esfera: "))
x = a ** 3
y = b * c * d
z = 1 / 3 * 3.141592 * e ** 2 * f
w = 4 / 3 * 3.141592 * g ** 3
print(" ")
print(" O volume do cubo e " + str(x))
print(" O volume do paralelepipedo e " + str(y))
print(" O volume do cone e " + str(z))
print(" O volume da esfera e " + str(w))

