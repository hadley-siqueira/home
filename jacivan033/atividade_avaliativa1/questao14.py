print("Tempo sem acidentes ")
d = int(input("Informe os dias sem acidentes: "))
a = d // 360
m = (d - a * 360) // 30
dd = d - a * 360 - m * 30
print("O tempo sem acidentes eh " + str(a) + " anos " + str(m) + " meses " + str(dd) + " dias " )
