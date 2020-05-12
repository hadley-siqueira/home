print("!!!Calculando Volumes!!!")

c = float(input("Informe p lado do cubo:"))
p = float(input("Informe a altura do paralelepidedo:"))
p1 = float(input("Informe o comprimento do paralelepipedo:"))
p2 = float(input("Informe a profundidade do paralelepipedo:"))
co = float(input("Informe a base do cone:"))
co1 = float(input("Informe a altura do cone:"))
e = float(input("Informe o raio da esfera:"))

vc = (c)**3
vp = (p)*(p1)*(p2)
rco = co/2
vco = (3.14*(rco**2)*co1)/3
ve = (4*3.14*(e**3))/3

print( )
print("_-_-_Volumes_-_-_")
print("cubo = " + str(vc))
print("paralelepidedo = " + str(vp))
print("cone = " + str(vc))
print("Esfera = " +  str(ve))
