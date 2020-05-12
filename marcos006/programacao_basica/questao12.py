print("** Dinheiro da fábrica de camisetas **")
qcp = int(input("Digite a quantidade de camisas P: "))
qcm = int(input("Digite a quantidade de camisa M: "))
qcg = int(input("Digite a quantidade de camisas G: "))
qtd_total = qcp + qcm + qcg
qtd_recebida = qcp*10 + qcm*12 + qcg*15
print("O valor que a fabrica terá é de " + str(qtd_recebida) + " R$")

