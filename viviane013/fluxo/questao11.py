pergunta = str(input("O que voce deseja calcular?"))

if pergunta == 'resistencia' or pergunta == 'Voltagem' or pergunta == 'corrente':
    if pergunta == 'resistencia':
       n1 = int(input("informe a voltagem:"))
       n2 = int(input("informe a corrente:"))
       resposta = n1 / n2
       print('A Resistencia eh:' + str(resposta))
    elif pergunta == 'Voltagem':
       r1 = int(input("informe a resistencia: "))
       r2 = int(input("Informe a corrente: "))
       resultado = r1 * r2
       print('A Voltagem eh:' + str(resultado))
    elif pergunta == 'corrente':
       v1 = int(input("informe a voltagem: "))
       v2 = int(input("Informe a resistencia: "))
       calc = v1 / v2
       print('A corrente eh: ' + str(calc))
else:
    print('opcao errada')
    print("")
    print("As opçoes sao:")
    print("")
    print("-Resistencia")
    print("")
    print("-Voltagem")
    print("")
    print("-Corrente")

