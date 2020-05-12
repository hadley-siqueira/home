print("**Dinheiro da fabrica de camisetas **")

quantidades_camisas_pequenas = int(input("Digite a quantidade: "))
quantidades_camisas_médias = int(input("Digite a quantidade: "))
quantidades_camisas_grandes = int(input("Digite a quantidade: "))
qtd_total = quantidades_camisas_pequenas + quantidades_camisas_médias + quantidades_camisas_grandes
qtd_recebida = quantidades_camisas_pequenas*10 + quantidades_camisas_médias*12 + quantidades_camisas_grandes*15
print("O valor que a fabrica terá é de" + str(qtd_recebida))

