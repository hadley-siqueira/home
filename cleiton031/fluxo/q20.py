x = int(input("Informe a coordenada de x:"))
y = int(input("Informe a coordenada de y:"))
c = input("Digite o comando:")
if c == "b":
    b = x - 10
    print("A nova coordenada eh " + "(" + str(b) + " , " + str(x) + ")")
elif c == "c":
    c = x + 10
    print("A noa coordenada eh " + "(" + str(c) + "," + str(x) + ")")
elif c == "e":
    e = y - 10
    print("A nova coordenada eh " + "(" + str (e) + "," + str (y) + ")")
elif c == "d":
    d = y + 10
    print("A nova coordenada eh " + "(" + str(d) + "," + str(y) + ")")
else:
    print("Comando incorreto")
