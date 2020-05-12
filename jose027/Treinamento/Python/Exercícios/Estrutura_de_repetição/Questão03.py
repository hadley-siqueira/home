print('*** Validação registro ***')

nome = str(input('Digite o nome desejado: '))
while len(nome) <= 3:
    print('Nome inválido, digite novamente:')
    nome = str(input('Digite o nome desejado: '))

idade = int(input('Digite a idade desejada: '))
while idade <= 0 or idade >= 150:
    print('Idade inválida, digite novamente') 
    idade = int(input('Digite a idade desejada: '))

salario = float(input('Digite o salário desejado: '))
while salario <= 0:
    print('Salário inválido, digite  novamente')
    salario = float(input('Digite o salário desejado: '))

sexo = str(input('Digite o sexo desejado: '))
while sexo[0].lower() !=  'm' and sexo[0].lower() != 'f' :
    print('Sexo inválido, digite novamente')
    sexo = str(input('Digite o sexo desejado: '))

e_civil = str(input('Digite o estado civil desejado: '))
e_civis = ['s', 'c', 'v', 'd']
e_civis2 = ['solteiro', 'casado', 'virgem', 'divorciado']
while e_civil[0].lower() not in e_civis or e_civil.lower() not in e_civis2:
    print('Estado civil inválido, digite novamente')
    e_civil = str(input('Digite o estado civil desejado: '))

print('Nome: ' + str(nome))
print('Idade: ' + str(idade) + ' anos')
print('Salário: R$' + str(salario) + ' reais')
print('E. civil: ' + str(e_civil))

    
