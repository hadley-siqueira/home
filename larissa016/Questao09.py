print("**Quantidade de salgados**")

d = float(input("Informe o total de dinheiro que possui:"))
ca = float(input("Quanto custava o salgado?"))
cg = float(input("Quanto custa um salgado?"))

ca1 = (d)/(ca)
cg1 = (d)/(cg)

print( )
print("Antes com R$" + str(d) + "voce podia comprar" + str(ca1) + "salgados")
print("Agota com R$" + str(d) + "voce so pode comprar" + str(cg1) + "salgados")

