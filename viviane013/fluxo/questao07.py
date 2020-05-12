N1 = int(input("Informe o primeiro numero: "))
N2 = int(input("Informe o segundo numero: "))
N3 = int(input("Informe o terceiro numero: "))

if N1 >= N2:
    if N1 <= N3:
        print("Os numeros estao em ordem decrescente")
    else:
        print("Os numeros NAO estao em ordem decrescente")
else:
    if N1 >= N3:
        print("Os numeros estao em ordem decrescente")
    else:
        print("Os numeros NAO estao em ordem decrescente")
