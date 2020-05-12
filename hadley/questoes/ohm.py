calc = input('O que voce deseja calcular? ')

if calc == "voltagem":
    a = float(input('Digite a corrente: '))
    r = float(input('Digite a resistencia: '))
    print('A voltagem eh de ' + str(a * r) + ' volts')
elif calc == "corrente":
    v = float(input('Digite a voltagem: '))
    r = float(input('Digite a resistencia: '))
    print('A corrente eh de ' + str(v / r) + ' amperes')
elif calc == "resistencia":
    v = float(input('Digite a voltagem: '))
    r = float(input('Digite a corrente: '))
    print('A resistencia eh de ' + str(v / r) + ' ohms')
else:
    print('Voce digitou uma opcao errada. As opcoes sao:\n  - resistencia\n  - voltagem\n  - corrente')
