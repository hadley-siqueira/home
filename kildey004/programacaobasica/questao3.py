print (" ******************************** ")
print (" **Calculo de dinheiro recebido** ")
print (" ******************************** ")
casamento = int (250)
certidao =int (30)

nC = int (input(" Digite a quantidade de casamentos: "))
nCD = int (input(" Digite a quantidade de certidoes: "))

Ctotal = casamento * nC
CDtotal = certidao * nCD

total = Ctotal + CDtotal

print(" Total ganho com casamentos: R$" + str(Ctotal))
print(" Total ganho com certidoes: R$" + str(CDtotal))
print(" Total geral: R$" + str(total))



