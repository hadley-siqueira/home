print("** Sistema de Alarme **\n")
s1 = int(input('Digite o valor do primeiro sensor: '))
s2 = int(input('Digite o valor do segundo sensor: '))
s3 = int(input('Digite o valor do terceiro sensor: '))

if s1 == 1 or s2 == 1 or s3 == 1:
    print('Alarme ativado')
else:
    print('Alarme desligado')
