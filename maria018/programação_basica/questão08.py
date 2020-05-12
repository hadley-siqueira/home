print(" >> Programa de volume das formas geometricas << ")
print(" ** volume de um cubo ** ")
lado_cubo = int(input(" Digite o lado do cubo: "))
vc = lado_cubo ** 3 
print(" ------------------------------------ ")
print(" ** Volume de um paralelepipedo ** ")
c = float(input(" Digite o comprimento: "))
l = float(input(" Digite a largura: "))
a = float(input(" Digite a altura: "))
vp = c * l * a
 
print(" --------------------------- ")
print(" ** Volume de um cone ** ")
ab = float(input(" Digite a area da base: "))
ac = float(input(" Digite a altura: "))
vcone = (ab * ac) / 3

print(" ----------------------------- ")
print(" ** Volume de uma esfera ** ")
raio = float(input(" Digite o raio: "))

ve = 4 * 3.14 * raio ** 3 

print()
print(" Os volumes ")
print(" Do cubo é " +str(vc))
print(" Do paralelepipedo é " + str(vp))
print(" Do cone é " + str(vcone))
print(" Da esfera e " + str(ve))
