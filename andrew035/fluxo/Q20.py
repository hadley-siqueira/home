cxr = int(input("Informe a coordenada x do robô: "))
cyr = int(input("Informe a coordenada y do robô: "))
c = str(input("Digite o comando: "))

if c == "b":
    b = cxr - 10
    print("A nova coordenada é: " + "(" + str(b) + "," + str(cxr) + ")")
elif c == "c":
    c = cxr + 10
    print("A nova coordenada é: " + "(" + str(c) + "," + str(cxr) + ")")
elif c == "e":
    e = cyr - 10
    print("A nova coordenada é: " + "(" + str(e) + "," + str(cyr) + ")")
elif c == "d":
    d = cyr + 10
    print("A nova coordenada é: " + "(" + str(d) + "," + str(cyr) + ")")
else:
    print("Comando incorreto.")
