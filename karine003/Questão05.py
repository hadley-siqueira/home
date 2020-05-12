print("**seguradora XYZ**")
print(">>sistema de Avaliaçoes<<")


s = int(input(" Quantidade de contratos simples:")) 
c = int(input("quantidade de contratos completos:")) 
st = 2300*(s)/10
ct = 3500*(c)/10
lt = int(st)+int(ct)

print( )
print("o lucro obtido foi de: R$" + str(lt) +",00")

