print("$$$$ Quantidade de Salgados $$$$")

d = float(input("Informe o total de dinheiro que posui:"))
ca = float(input("Quanto custava um salgado?"))
cg = float(input("Quanto custa um salgado?"))

ca1 = (d)/(ca)
cg1 = (d)/(cg)

print( )
print("Antes com R$" + str(d) + "Voce podia comprar" + str(ca1) + "salgados")
print("Agora com R$" + str(d) + "Voce so pode comprar" + str(ca1) + "salgados")
