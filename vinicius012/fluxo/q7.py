x = int(input("Digite um numero: "))
y = int(input("Digite outro numero: "))
z = int(input("Digite mais um numero: "))
if x < y:
    if x < z:
         print("Esta em ordem crescente")
    else:
        print("Nao esta em ordem crescente")
        
else:
     print("Nao foi digitado em ordem crescente")
