x = int(input("Informe o a coordenada de x: "))
y = int(input("Informe o valor de y: "))
xi = int(input("Informe o inicio de x no retangulo:"))
xf = int(input("Informe o final de x no retangulo:"))
yi = int(input("Informe o inicio de y no retangulo:"))
yf = int(input("Informe o final de y no retangulo:"))
if xi < x and x < xf:
    if  yi < y and y < yf:
        print("esta dentro")
    else:
        print("esta fora")
else:
    print("esta fora")
