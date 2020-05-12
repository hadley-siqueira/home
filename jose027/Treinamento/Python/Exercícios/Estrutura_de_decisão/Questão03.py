print('*** Validação de sexo ***')
s = str(input('Digite o sexo: '))

if s.upper() == 'M':
    print('M-Maculino')
elif s.upper() == 'F':
    print('F-Feminino')
else:
    print('Sexo inválido')
