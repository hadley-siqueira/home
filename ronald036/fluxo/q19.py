x = int(input("informe a ooordenada x:"))
y = int(input("digite o valor de y:"))
xi = int(input(" o inicio de x no retangulo:"))
xf = int(input("o final de x no retangulo:"))
yi = int(input("o inicio de y no retangulo:"))
yi = int(input("o final de y no retangulo:"))
if xi < x and x < xf:
    if yi < y and y < yf:
        print("ta dentro")
    else:
        print("ta fora")
else:
    print("ta fora")
