print(" >> Tempo sem acidentes<< ") 

a = int(input(" Informe os dias sem acidentes: "))
e = a // 360 
i = (a - e * 360) // 30
aa = a - e * 360 - i * 30

print(" O tempo sem acidentes é: " + str(e) + " Anos " + str(i) + " Meses " + str(aa) + " Dias ") 
