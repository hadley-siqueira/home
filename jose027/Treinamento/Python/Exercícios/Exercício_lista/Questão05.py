print('*** Média dos alunos ***')
vet_nota = []
a_7 = 0

for c in range(0, 10):
    print(str(c + 1) + '° aluno')
    soma = 0
    for cont in range(0, 4, +1):
        nota = float(input('Digite a ' + str(cont + 1) + '° nota do ' + str(c + 1) + '° aluno: '))
        while nota < 0 or nota > 10:
            print('Nota inválida, digite novamente')
            nota = float(input('Digite a ' + str(cont + 1) + '° nota do ' + str(c + 1) + '° aluno: '))
        vet_nota.append(nota)
    for c in vet_nota:
        soma += c
    media = soma / 4
    print('Média: ' + str(media))
    if media >= 7:
        a_7 += 1
    vet_nota.clear()

print('Quantidade de alunos com média maior ou igual a 7: ' + str(a_7))
     
         
