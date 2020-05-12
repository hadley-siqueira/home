print(" Horas em segundos ")
H = int(input(" Que horas são: "))
Min = int(input(" Quantos minutos: "))
S = int(input(" Quantos segudos: "))
SH = (H * 60) * 60
SM = Min * 60
SEGUNDOS = SH + SM + S 
print(" O TOTAL EM SEGUNDOS É:" + str(SEGUNDOS)) 
