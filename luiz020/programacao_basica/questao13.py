import math

print(" Programa do Plano Cartesiano ")

ax = int(input("Informe o primeiro número do par ordenado: "))

ay = int(input("Informe o segundo número do par ordenado: "))

bx = int(input("Informe o terceiro número do par ordenado: "))
 
by = int(input("Informe o quarto número do par ordenado: "))

c = (ax - bx) 

d = (ay - by) 

e = c * c + d * d

raiz = e ** 0.5
 
print("A distância eh: " + str(raiz))

