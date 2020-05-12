print("** Seguradora **")
print("    >> Sistema de avaliação <<")
qtd_contratos_completos = int(input('qtd de contratos completos: '))
qtd_contratos_simples = int(input('qtd de contratos simples: '))
total = qtd_contratos_completos * 350 + qtd_contratos_simples * 230
print('total: R$' + str(total))
