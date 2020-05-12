n = int(input("Informe a hora: "))
m = int(input("Informe os minutos: "))
s = int(input("Informe os segundos: "))

hora = h * 3600
minuto = m * 60
segundos = s * 1
total = hora + minuto + segundos

print("Valor total em segundos: " + str(total))
