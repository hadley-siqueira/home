print("** Seguradora XYZ ** ")
print(" >> Sistema de avaliacao <<")

simples = int(input(" Qtd de contratos simples: "))
completos = int(input(" Qtd de contratos completos: "))
resultado = 3850 * completos + 2530 * simples - 2300 * simples - 3500 * completos
print('Lucro obtido: ' + str(resultado))

