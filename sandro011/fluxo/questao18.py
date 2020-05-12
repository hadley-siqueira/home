import math

cx = int(input(" informe o primeira cooerdenada de X do centromdo circulo: "))
cy = int(input(" informe a segunda cordenada de X: "))
px = int(input(" informe o primeiro valor de Y: "))
py = int(input(" informe o segundo valor de Y: "))
c = px
r = int(input(" informe o raio do ciculo: "))
d = math.sqrt((cx - px) ** 2 + (cy-py) ** 2)

if d < r:
    print( "esta dentro ")
else:
    print(" esta fora")
