print(" *** Seguradora XYZ *** ")
print(" >>> Sistema de Avaliação <<< ")

qtd_de_contratos_simples = int(input('qtd de contratos simples: '))
qtd_de_contratos_completos = int(input('qtd de contratos completos: '))
total = qtd_de_contratos_completos * 350 + qtd_de_contratos_simples * 230

print('total: R$' + str(total))
