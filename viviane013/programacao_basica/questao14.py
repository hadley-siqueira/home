print("Calculador de anos,meses e anos ")
dias = int(input("Diga-me o numero: "))
anos = dias // 360
dia = dias - (anos * 360)
meses = dia // 30
d = dia - (meses * 30)

print("numero informado em dias: " + str(d))
print("numero informado em meses: " + str(meses))
print("numero informado em anos: " + str(anos))



