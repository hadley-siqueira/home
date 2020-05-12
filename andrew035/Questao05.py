print("** Seguradora XYZ **")
print (">> Sistema de avaliação <<")

n = int(input("Qtd de contratos simples: "))
c = int(input("Qtd de contratos completos: "))

simples = n * 230
completo = c * 350
Lucro = simples + completo

print("Lucro obtido: " + str(Lucro))
