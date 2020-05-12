x = int(input("Digite a coordenada x do robo: "))
y = int(input("Digite a coordenada y do robo: "))
z = input("Digite o comando: ")

if z == "c":
    print("A coordenada do robo sera ("+str(x)+","+str(y+10)+")")
elif z == "b":
    print("A coordenada do robo sera ("+str(x)+","+str(y-10)+")")
elif z == "e":
    print("A coordenada do robo sera ("+str(x-10)+","+str(y)+")")
elif z == "d":
    print(" A coordenada do robo sera ("+str(x+10)+","+str(y)+")")
