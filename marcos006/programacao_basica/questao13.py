print("** Programa calculador de distância euclidiana entre dois pontos")
x0 = float(input("Informe o valor de x0: "))
y0 = float(input("Informe o valor de y0: "))
x1 = float(input("Informe o valor de x1: "))
y1 = float(input("Informe o valor de y1: "))

calc =((x1 - x0) * (x1 - x0) + (y1 -y0) * (y1 - y0))**0.5
print("A distância euclidiana entre dois pontos é " + str(calc))
