print("** seguradora xyz ** ")
print(" >> sistema de avaliacao <<")

simples = int(input(" qtd de contratos simples: "))
completos = int(input(" qtd de contratos completos: "))
resultado = 3850 * completos + 2530 * simples - 2300 * simples - 3500 * completos
print("lucro obtido: " + str(resultado)) 
