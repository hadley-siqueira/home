print("**programa para converter o calendário**")
dias = int(input(" Digite os dias que você quer "))
ano = dias//365
mes = (dias - ano*365) //30
dia =  dias - ano * 365 - mes * 30
print(" o ano desse calendario é" + str (ano))
print(" os meses desse calendário é" + str (mes))
print(" os dias desse calendário e " + str (dia))

