print(" **programa para a poupança de pedrinho** ")
qtd_moedas_1_centavos = int(input(" Digite a quantidade de moedas: "))
qtd_moedas_5_centavos = int(input(" Digite a quantidade de moedas: "))
qtd_moedas_10_centavos = int(input(" Digite a quantidade de moedas: "))
qtd_moedas_25_centavos = int(input(" Digite a quantidade de moedas: "))
qtd_moedas_50_centavos = int(input(" Digite a quantidade de moedas: "))
qtd_moedas_1_real = int(input(" Digite a quantidade de moedas: "))

valor_reais = qtd_moedas_1_centavos * 0.01 + qtd_moedas_5_centavos * 0.05 + qtd_moedas_10_centavos * 0.10 + qtd_moedas_25_centavos * 0.25 + qtd_moedas_50_centavos * 0.50 + qtd_moedas_1_real * 1.00
print("O valor poupado em reais é de " + str (valor_reais))
