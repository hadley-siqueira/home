x = float(input("Digite a coordenada x do robo: "))
y = float(input("Digite a coordenada y do robo: "))
z = str(input("Digite o comando: "))
 
if z in  ("c", "C" , "cima" , "CIMA"):
    y = y + 10
    print("O robo esta na coordenada " + str(y))
if z in ("b" + "B" + "baixo" + "BAIXO"):
    y = y - 10
    print("O robo esta na coordenada " + str(y))
if z in ("e" , "E" , "esquerda" , "ESQUERDA"):
    x = y - 10 
    print("O robo esta na coordenada " + str(x))
if z in("d", "D" , "direita", "DIREITA"):
    x = x + 10
    print("O robo esta na coordenada " + str(x))                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    

