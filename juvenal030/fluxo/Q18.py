import math

cx = int(input("informe o primeira cordenada de x na circuferencia: "))
cy = int(input("informe a primeira cordenada de x: "))
px = int(input("informe o primeiro valor de y: "))
py = int(input("informe o segundo valor de y: "))
z = px
l = int(input("informe o raio do circulo: "))
j = math.sqrt((cx - px) ** 2 + (cy-py) ** 2)

if j < l:
    print("esta dentro")
else:
    print("esta fora")

 
