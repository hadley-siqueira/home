print("Volume de um Cubo")
lado = float(input("Informe o lado do Cubo: "))
volume_cubo = lado * lado * lado
print("O volume do Cubo eh: " + str(volume_cubo))

print("Volume de um Paralelepípedo")
altura = float(input("Informe a altura do Paralelepípedo: "))
comprimento = float(input("Informe o comprimento do Paralelepípedo: "))
base = float(input("Informe a base do Paralelepípedo: "))
volume_para = altura * comprimento * base
print("O volume do Paralelepípedo eh: " + str(volume_para))

print("Volume de uma Esfera")
raio = float(input("Informe o raio da Esfera: "))
vol_esf = 4 * 3.14 * raio * raio * raio/3
print("O volume da Esfera eh: " + str(vol_esf))



