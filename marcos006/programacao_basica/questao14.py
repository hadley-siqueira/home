print("Calculador de tempo de trabalho sem acidentes")
d = int(input("Informe o tempo em dias de trabalho sem acidentes: "))
a = d // 360
m = (d - a *360) // 30
dd = d - (a * 360) - m * 30
print("O tempo sem acidentes é " + str(a) + " anos " + str(m) + " mêses " + str(dd) + " dias")
