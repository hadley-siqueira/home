print("**calculando volumes**")

c = float(input("informe o lado do cubo:"))
p = float(input("informe a altura do paralelepipedo:"))
p1 = float(input("informe o comprimento do paralelepipedo:"))
p2 = float(input("informe a profundidade do paralelepipedo:"))
co = float(input("informe a base do cone:"))
co1 = float(input("informe a altura do cone:"))
e = float(input("informe o raio da esfera:"))

vc = (c)**3
vp = (p)*(p1)*(p2)
rco = co/2
vco = (3.14*(rco**2)*co1)/3
ve = (4*3.14*(e**3))/3

print( )
print(">>Volume<<")
print("Cubo = " + str(vc))
print("Paralelepipedo = " + str(vp))
print("Cone = " + str(vco))
print("Esfera = " + str(ve))

