n1 = int(input(" informe o primeiro numero: "))
n2 = int(input(" informe o segundo numero: "))
n3 = int(input(" informe o terceiro numero:"))
if n1 > n2 and n1 > n3:
    if n1 >= n3:
         print(" esta em ordem decrescente ")
    else: 
         print(" NAO esta em ordem drecescente ")
else:
    if n1 >= n3: 
        print("Os numeros estao em ordem decrescente")
    else:
        print("Os numeros NAO estao em ordem decrescente")


