print('** volume do cubo **')
lado = float(input('digite o lado do cubo: '))
volume_cubo = lado * lado * lado
print('o volume do cubo será de ' + str(volume_cubo))

print('** volume do paralelepipedo **')
altura = float(input('digite a altura do paralelepipedo: '))
comprimento = float(input('digite o comprimento do paralelepipedo: '))
base = float(input('digite a base do paralelepipedo: '))
volume_paralelepipedo = altura * comprimento * base
print('o volume do paralelepipedo sera de ' + str(volume_paralelepipedo))

print('** volume de uma esfera **')
raio = float(input('digite o raio da esfera: '))
volume_esfera = 4 * 3.14 * raio * raio *raio/3
print('o volume da esfera sera de ' + str(volume_esfera))

