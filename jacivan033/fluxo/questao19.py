x = int(input("Informe a coordenada de X:"))
y = int(input("Informe o valor de y:"))
xi = int(input("Informe o inicio de X no retangulo:"))
xf = int(input("Informe o final de x no retangulo:"))
yi = int(input("Informe o inicio de Y no retangulo:"))
yf = int(input("Informe o final de Y no retangulo:"))
if xi < x and x < xf:
    if yi < y and y < yf:
        print("Esta dentro")
    else:
        print("esta fora")
else: 
    print("Esta fora")
