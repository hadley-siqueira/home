x = int(input("Digite a coordenada x do robo:"))
y = int(input("Digite a coordenada y do robo:"))
c = input("Digite o comando:")

if c == "b":
    print("Nova coordenada do robo:" + "("+str(x)+","+str(y-10)+")")
elif  c == "c":
    print("Nova coordenada do robo:" + "("+str(x)+","+str(y+10)+")")
elif c == "e":
    print("Nova coordenada do robo:" + "("+str(x-10)+","+str(y)+")")
elif c == "d":
    print("Nova coordenada do robo:" + "("+str(x+10)+","+str(y)+")")

        
    
