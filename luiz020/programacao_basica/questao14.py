print(" Programa de Tempo de Trabalho ")

dias = int(input("Informe a quantidade de dias: "))

anos = dias // 360

dias = dias - (anos * 360)

meses = dias // 30

dias = dias - (meses * 30)

print("Sem acidentes em anos: " + str(anos))

print("Sem acidentes em meses: " + str(meses))

print("Sem acidentes em dias: " + str(dias))

