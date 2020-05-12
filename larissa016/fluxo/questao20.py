cx = int(input("Digite a coordenada x do robo:"))
cy = int(input("Digite a coordenada y do robo:"))
cr = input("Digite o comando:")
if cr=='c':
    print('Nova coordenada: (' + str(cx) + ', ' +str(cy+10) + ')')
elif cr=='b':
    print("Nova coordenada: (" + str(cx) + ", " + str(cy+10) + ")")
elif cr=="d":
    print("Nova coordenada: (" + str(cx+10) + ", "+ str(cy) + ")")
elif cr=="e":
    print("Nova coordenada: (" + str(cx+10) + ", " + str(cy) + ")")

