print (" KR seguros")

print (" >> Avaliacao dos candidatos << ")
contratoS = float(2300)
contratoC = float(3500)

qs = float(input("Qtd de contratos simples: "))
qc = float(input("Qtd de contratos completos: "))

csT = contratoS * qs
ccT = contratoC * qc

total = csT + ccT
lucro = total / 10 

print ("lucro obtido: R$" + str(lucro))


