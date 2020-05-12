print('*** Média escolar ***')

nota1 = float(input('Digite a primeira nota: '))
nota2 = float(input('Digite a segunda nota: '))

media = (nota1 + nota2) / 2 

print('Média: ' + str(media))

if media >= 7 and media <= 9.9:
    print('Parabéns, você foi aprovado')
elif media == 10:
    print('Parabéns, você foi aprovado com distinção')
else:
    print('Você foi reprovado')
    
