x = int(input("Informe a coordenada de X:"))
y = int(input("Informe a coordenada de Y:"))
c = input("Digite o comando:")
if c == "b":
    b = x - 10
    print("A nova coordenada eh " + "(" + str( b) + " ," + str(x) + ")")
elif c == "c":
    c = x + 10
    print("A nova coordenada eh " + "(" + str(c) + " ," + str(x) + ")")
elif c == "e":
    e = y - 10
    print("A nova coordenada eh " + "(" + str(e) + " ," + str(y) + ")")
elif c == "d":
    d  = y + 10
    print("Anova coordenada eh " + "(" + str(d) + " ," + str(Y) + ")")
else:
    print("Comando incorreto")

