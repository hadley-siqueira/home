print(" calculo da distancia eclidiana ")
n = float(input(" informe o x1: "))
u = float(input(" informe o x0: "))
i = float(input("informe o y0: "))
o = float(input("informe o y1: "))
x  = (n - u) * (n -u)
y = (o - i) * (o - i)
d = (x + y) ** 0.5
print(" a distancia eclidiana " + str(d))
