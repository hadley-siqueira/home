x = int(input("digite a coordenada de x:"))
y = int(input("digite a coordenada de y:"))
r = input("informe o comando:")
if r == "b":
    b = x - 10
    print("a nova coordenada é" + "(" + str(b) + "," + str(x) + ")")
elif r == "r":
    r = x + 10    
    print("a nova coordenada é" + "(" + str(r) + "," + str(x) + ")")
elif r == "e":
    e = y - 10 
    print("a nova coordenada é" + "(" + str(e) + "," + str(y) + ")")
elif r == "d":
    d = y + 10
    print("a nova coordenada é" + "(" + str(d) + "," + str(y) + ")")
else:
    print("seu comando está incorreto")
