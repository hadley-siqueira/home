print("**Calculando Volume**")

c = float(input("Informe o lado do cubo: "))
p = float(input("Informe a altura do paralelepipedo: "))
p1 = float(input("Informe o comprimento do paralelepipedo: "))
p2 = float(input("Informe a profundidade do paralçelepipedo: "))
co = float(input("Informe a base do cone: "))
col = float(input("Informe a altura do cone: "))
e = float(input("Informe o raio da esfera: "))

vc = (c)**3
vp = (p)*(p1)*(p2)
rco = co/2
vco = (3.14*(rco**2))*col/3



ve = (4*3.14*(e**3))/3

print( )
print(">>Volumes<<")
print("Cubo = " + str(vc))
print("Paralelepipedo = " + str(vp))
print("Cone = " + str(vc))
print("Esfera = " + str(ve))
