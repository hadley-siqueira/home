print(" tempo sem acidentes ")
x = int(input(" informe os dias sem acidentes "))
c = x // 360
z = (x - c *360) // 30
xx = x - c * 360 - z * 30
print(" o tempo sem acidentes eh " + str(c) + " anos " + str(z) + " meses " +
str(xx)+ "dias" )
