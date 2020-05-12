print("Calculo da distancia eclidiana ")
n = float(input("Informe o x1: "))
u = float(input("Informe o x0: "))
i = float(input("Informe o y0: "))
o = float(input("Informe o y1: "))
x = (n - u) * (n - u)
y = (o - i) * (o - i)
d = (x + y) ** 0.5
print("A distancia eclidiana " + str(d))
