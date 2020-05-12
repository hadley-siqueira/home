print ("**Indicador de volumes**")

ldc = float(input("digite o lado do cubo: "))

hprl = float(input("digite a altura do paralelepipedo: "))
pprl = float(input("digite a profundidade do paralelepipedo: "))
cprl = float(input("digite o comprimento do paralelepipedo: "))

bcn = float(input("digite a base do cone: "))
hcn = float(input("digite a altura do cone: "))

res = float(input("digite o raio da esfera: "))

vcubo = ldc ** 3

vprl = hprl * pprl * cprl

vcone = 3.14 * bcn ** 2 * hcn / 3

vesf = 3.14 * res ** 3 / 3

print( " O volume do cubo e: " + str(vcubo))

print( " O vlume do paralelepipedo e: " + str(vprl))

print( " O volume do cone e: " + str(vcone))

print( " o volume da esfera e: " + str(vesf))

