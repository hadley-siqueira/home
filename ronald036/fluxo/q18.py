print("*****R E T Â N G U L O*****")
rx = int(input("digite a coordenada que você quer:"))
ry = int(input("digite a coordenada que você quer:"))
rx2 = int(input("digite a coordenada que você quer:"))
ry2 = int(input("digite a coordenada que você quer:"))
rx3 = int(input("digite a coordenada que você quer:"))
ry3 = int(input("digite a coordenada que você quer:"))
if rx3 > rx and rx3 < rx2:
    print("O PONTO TA DENTRO DO RETÃNGULO")
else:
    if rx3 < rx and rx3 > rx2:
        print("O PONTO TA FORA DO RETÂNGULO")
    else:
        print("O PONTO TA DENTRO DO RETÂNGULO")
