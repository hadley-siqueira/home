x = int(input(" informe o a coredenada de X: "))
y = int(input(" informe o valor de Y: "))
xi = int(input(" informe o inicio de X no retangulo: "))
xf = int(input(" informe o final de x no retangulo: "))
yi = int(input("informe o inicio do Y no retangulo: "))
yf = int(input(" informe o final de Y no ratangulo: "))
if xi < x and x < xf:
    if yi < y and y < yf:
        print(" esta demtro")
    else:
        print("esta fora ")
else:
    print(" esta fora")
