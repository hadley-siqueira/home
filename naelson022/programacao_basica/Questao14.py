print(" tempo sem acidentes ")
d = int(input(" informe os dias sem acidentes "))
a = d // 360
m = (d - a *360) // 30
dd = d - a * 360 - m * 30
print(" o tempo sem acidentes eh " + str(a) + " anos "  + str(m) + " meses "  + str(dd)+ "dias" )
