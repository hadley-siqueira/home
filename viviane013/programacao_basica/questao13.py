import math

print("Calculador de distancia euclinada")
px = float(input("Me informe o numero para px: "))
qx = float(input("Me informe o numero para qx: "))
py = float(input("Me informe o numero para py: "))
qy = float(input("Me informe o numeropara py: "))
calc = math.sqrt((px - qx) * (px - qx) + (py - qy) * (py - qy))
print("A distancia euclinada eh: " + str(calc))
