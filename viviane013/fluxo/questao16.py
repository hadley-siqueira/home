c1 = int(input("Informe o numero:"))
c2 = int(input("Informe o segundo numero: "))
c3 = int(input("Informe o terceiro numero: "))
resultado1 = c1 + c2
resultado2 = c2 + c3
resultado3 = c1 + c3

if resultado1 == c1 or resultado1 == c2 or resultado1 == c3 or resultado2 == c1 or resultado2 == c2 or resultado2 == c3 or resultado3 == c1 or resultado2 == c2 or resultado3 == c3:
    print("Ha resultado na soma dos outros dois")
else:
    print("Nao ha soma nos outros dois")
