print(" >> Tempo de trabalho sem acidente <<")
dias = int(input(" Digite o tempo sem acidentes (em dias):"))
dias_copia = dias 
anos = dias// 365
dias = dias - (anos*356)
meses = dias // 30
dias = dias - (meses*30)

print(str(dias_copia) + "dias = " + str(anos) + " anos," + str(meses) + "meses e" + str(dias) + "dias")

