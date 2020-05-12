dias = int(input("informe o tempo de trabalho: "))
anos = dias // 360
dias = dias - anos * 360
meses = dias // 30
dias = dias - meses * 30 
print("a quantidade de anos eh: " + str(anos) )
print("a quantidade de meses eh: " + str(meses) )
print("a quantidade de dias eh: " + str(dias) )



