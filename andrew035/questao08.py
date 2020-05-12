lado_do_cubo = int(input("Dê o lado de um cubo: "))

Alt_Paralelepipedo = int(input("Informe a altura do paralelepipedo: "))

compr_do_Paralelepipedo = int(input("Informe o comprimento do paralelepipedo: "))
 
prof_Paralelepipedo = int(input("Informe a profundidade do paralelepipedo: "))

base_de_um_cone = int(input("Informe a base de um cone: "))

alt_cone = int(input("Informe a altura de um cone: "))

raio_da_esfera = int(input("Informe o raio da esfera: "))

vcubo = lado_do_cubo * lado_do_cubo * lado_do_cubo

vparalelepipedo = Alt_Paralelepipedo * compr_do_Paralelepipedo * prof_Paralelepipedo

vbcone = 3.14 * base_de_um_cone ** 2 * alt_cone/3

resfera = 4 * 3.14 * raio_da_esfera ** 3/3

print("O volume do cubo eh: " + str(vcubo))

print("O volume do paralelepipedo eh: " + str(vparalelepipedo))

print("O volume do cuno: " + str(vbcone))

print("o Raio da esfera: " + str(resfera))


