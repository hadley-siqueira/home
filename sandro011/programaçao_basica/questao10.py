x = int(input("informe a hora: "))
y = int(input("informe os minutos: "))
z = int(input("informe os segundos: "))
hs = x * 60 * 60 
ms = y * 60
ss = z
ts = hs + ms + ss

print("total de segundos: " + str(ts))

