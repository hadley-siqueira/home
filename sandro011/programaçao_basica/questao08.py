print("**programa gerador de volume de objetos**")

lado = int(input("informe o lado do cubo: "))
vcubo = lado * lado * lado
print("o volume do cubo eh: " + str(vcubo))


altura = int(input("informe a altura do paralelepipedo: "))
comprimento = int(input("informe o comprimento do paralelepipedo: "))
profundidade = int(input("informe a profundidade do paralelepipedo: "))
vparalelepipedo = altura * comprimento * profundidade
print(" o volume do paralelepipedo eh:  " + str(vparalelepipedo))


base = int(input("informe a base do cone: "))
alturac = int(input("informe a altura do cone: ")) 
vcone = base * altura / 3
print("informe o volume do cone: " + str(vcone))


raio = int(input("informe o raio da esfera: "))
vesfera = 4.0 / 3.0 * 3.1415 * raio * raio * raio
print(" o volume do paralelepipedo eh: " + str(vesfera))




