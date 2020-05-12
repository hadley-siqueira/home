print("**Questao de Salgados**")

d = float(input("Informa o total de dinheiro que possui:"))
ca = float(input("Quanto custava um salgado?"))
cg = float(input("Quanto custa um salgado?"))

ca1 = (d)/(ca)
cg1 = (d)/(cg)
print( )
print("Antes com R$" + str(d) + "voce podia comprar" + str(ca1) + "salgados")
print("Agora com R$" + str(d) + "voce so  pode comprar" + str(cg1) + "salgados")
