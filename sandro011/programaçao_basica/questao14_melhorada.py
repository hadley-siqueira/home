dias = int(input("informe o tempo de trabalho: "))
msg = str(dias) + " dias equivale a "
anos = dias // 360
dias = dias - anos * 360
meses = dias // 30
dias = dias - meses * 30 

if anos > 1:
    msg += str(anos) + " anos, "
else:
    msg += str(anos) + " ano, "

if meses > 1:
    msg += str(meses) + " meses e "
else:
    msg += str(meses) + " mes e "

if dias > 1:
    msg += str(dias) + " dias"
else:
    msg += str(dias) + " dia"

print(msg)


