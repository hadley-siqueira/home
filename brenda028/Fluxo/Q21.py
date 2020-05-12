print(">>Sistema de alarme<<")
s1 = int(input("Digite o valor do primeiro sensor:"))
s2 = int(input("Digite o valor do segundo sensor:"))
s3 = int(input("Digite o valor do terceiro sensor:"))

if s1==0 and s2==0 and s3==0:
    print("Alarme desativado")
else:
    print("O alarme está ativado")

