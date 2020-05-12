print(" ** Seguradora HDI ** ")
print(" >>> SISTEMA DE AVALIAÇÃO <<< ")
qcs = int(input(" Quantidade de contratos simples: "))
qcc = int(input(" Quantidade de contratos completos: "))

contrato_simples = int(2300)

contrato_composto = int(3500)

lucro = (float(contrato_simples) * qcs + float(contrato_composto) * qcc) * 0.1
print(" lucro obtido: R$ " + str(lucro)) 
