coordenadax = int(input("Digite a coordenada x do robo:"))
coordenaday = int(input("Digite a coordenada y do robo:"))
comando = str(input("Digite o comando:"))

if comando == "c":
    coordenadax = coordenadax + 0
    coordenaday = coordenaday + 10
    print("(" + str(coordenadax) +" , " + str(coordenaday) + ")")

elif comando == "b":
    coordenadax = coordenadax + 0 
    coordenaday = coordenaday - 10
    print("(" + str(coordenadax) +" , " + str(coordenaday) + ")")

elif comando == "e":
    coordenadax = coordenadax + 0
    coordenaday = coordenaday - 10
    print("(" + str(coordenadax) +" , " + str(coordenaday) + ")")

elif comando == "d":
    coordenadax = coordenadax + 0
    coordenaday = coordenaday + 10
    print("(" + str(coordenadax) +" , " + str(coordenaday) + ")")
    
