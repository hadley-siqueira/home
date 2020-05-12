print("**Seguradora XYZ**")
print(" >>Sistema de Avaliação<< ")

n = int(input(" Informe a quantidade de contratos simples: "))
v = int(input(" Informe a quantidade de contratos completos: "))
c = n * 1500
j = v * 2500
a = n * 3500
w = v * 4500
z = c + j
e = a + w
s = e - z

print(" O lucro eh " + str(s))  
