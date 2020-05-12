print("**Sistema de alerta**")

n1 = int(input("Digite o valor do primeiro sensor:"))
n2 = int(input("Digite o valor do segundo sensor:"))
n3 = int(input("Digite o valor do terceiro sensor:"))
if n1 == 1 or n2 == 1 or n3 == 1:
    print("alarme ativado")
else:
    print("alarme desativado")
