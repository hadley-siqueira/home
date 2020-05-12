print("Somador de notas do bimestre")
notpri= int(input("Diga-me sua nota: "))
b1 = int(input("Informe o bimestre: "))

notseg = int(input("Diga-me sua nota: "))
b2 = int(input("Informe o bimestre: "))

notter = int(input("Diga-me sua nota: "))
b3 =int(input("Informe o bimestre: "))

notquar = int(input("Diga-me sua nota: "))
b4 = int(input("Informe o bimestre: "))

cima = b1 * notpri + b2 * notseg + b3 * notter + b4 * notquar 
baixo = b1 + b2 + b3 + b4
res = cima / baixo
print("sua nota total eh: " + str(res))
