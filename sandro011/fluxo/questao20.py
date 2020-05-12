x = int(input(" informe a cooerdenada de X: "))
y = int(input(" informe a cooerdenada de Y: "))
c = input(" digite o comando: ")
if c == "b":
    b = x - 10
    print(" a nova cooerdenada eh " + "(" + str(b) + " ," + str(x) + ")")
elif c == "c":
    c = x + 10
    print(" a nova coordenada eh " + "("+ str(c) +  "," + str(x) + ")" )
elif c == "e":
    e = y - 10
    print(" a nova cooerdenada eh " + "("+ str(e) + "," + str(y) + ")")
elif c == "d":
    d  = y + 10
    print("a nova coordenada eh " + "(" + str(d) + "," + str(y) + ")" )
else:
    print(" comando incorreto ")
