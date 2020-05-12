print("Calendario de acidentes")

dia = int(input("Digite a quantidade de dias sem acidentes: "))

ano = int(dia / 360)
mes = int((dia - ano * 360) / 30)
dias = int(dia - ano * 360 - mes * 30)

print("Tempo sem acidentes: " + str(ano) + " anos, " + str(mes) + " meses, " + str(dias) + " dias.")

