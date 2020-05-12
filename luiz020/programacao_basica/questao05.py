print("** Seguradora XYZ **")
print("    >> Sistema de avalaiação <<")

contrato_sim = int(input("Qtd de contratos simples: "))

contrato_com = int(input("Qtd de contratos completos: "))

lucro = contrato_com * 350 + contrato_sim * 230

print("Lucro obtido: R$ " + str(lucro))

