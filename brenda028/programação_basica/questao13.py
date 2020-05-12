print(" >>Calculo da distância euclidiana<< ")

a = float(input(" Informe o x1: "))
b = float(input(" Informe o x0: "))
c = float(input(" Informe o y0: "))
d = float(input(" Informe o y1: "))
e = (a - b) * (a - b)  
f = (d - c) * (d - c)
g = (e + f) ** 0.5

print("  A distância euclidiana: " + str(g))

