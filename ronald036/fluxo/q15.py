print("soma dos números")
r1 = int(input("informe um número desejado:"))
r2 = int(input("informe um número desejado:"))
r3 = int(input("informe um número desejado:"))
if r1 + r2 == r3:
    print(" a soma dos dois números é igual ao terceiro")
elif r2 + r3 == r1:
    print(" a soma dos dois números é igual ao primeiro")
elif r1 + r3 == r2:
    print(" a soma do dois  números é igual ao segundo") 
else:
    print(" a soma dos números não dá o que você deseja")
