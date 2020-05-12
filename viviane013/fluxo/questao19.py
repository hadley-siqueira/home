xrimeiro1 = int(input("Digite o x do primeiro vertice:"))
yrimeiro2 = int(input("Digite o y do primeiro vertice:"))
iegundo1 = int(input("Digite o x do segundo vertice:"))
tegundo2 = int(input("Digite o y do segundo vertice:"))
poordenadax = int(input("Digite a coordenada x do ponto:"))
roordenaday = int(input("Digite a coordenada y do´ponto:"))

if poordenadax < iegundo1 and poordenadax > xrimeiro1 and roordenaday > tegundo2 and roordenaday < yrimeiro2:
    print("O ponto esta dentro")
else:
    print("O ponto esta fora")

