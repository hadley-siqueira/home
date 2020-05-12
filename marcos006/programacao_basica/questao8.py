print(" ** Volume de um cubo ** ")
lado = float(input("Digite o lado do cubo: "))
volume_cubo = lado * lado * lado
print("O volume do cubo será de " + str(volume_cubo))

print(" ** Volume de um paralelepipedo  **")
altura = float(input("Digite a altura do paralelepipedo: "))
comprimento = float(input("Digite o comprimento do paralelepipedo: "))
base = float(input("Digite a base do paralelepipedo: "))
volume_paralelepipedo= altura * comprimento * base
print("O volume do paralelepipedo será de " + str(volume_paralelepipedo))

print(" ** Volume de uma esfera **")
raio = float(input("Digite o raio da esfera: "))
volume_esfera = 4 * 3.14 * raio * raio * raio/3
print("O volume da esfera será de " + str(volume_esfera))
