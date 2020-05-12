print("**Seguradora XYZ**")
print(">>Sistema de avaliacao<<")

cs = int(input("Quantidade de contratos simples: "))
cc = int(input("quantidade de contratos completos: "))
cst = 2300 * (cs)/10
cct = 3500 * (cc)/10
lt = int(cst) + int(cct)

print("O lucro obtido foi de: R$ " + str(lt) +",00")

