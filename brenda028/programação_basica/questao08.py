print ("** Programa de volume das formas geometricas ** ")
l = float(input("Digite um lado do cubo:"))
v = l * l * l 
print("O volume do cubo sera" + str (v))

print(" ** Volume de um paralelepipedo ** ")
c = float(input("Diite o comprimento:"))
l = float(input("Digite a largura:"))
a = float(input("Digite a altura:"))
y = c * l * a
print("O volume do paralelepipedo" + str (y))

print("** Volume de uma esfera **")
r = float(input("Informe o raio da esfera:"))
w = 4 * 3.14 * r * r * r / 3 
print("O volume da esfera eh: " + str (w))

