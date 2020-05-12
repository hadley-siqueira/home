pergunta = str(input("O que voce pode deseja calcular?"))

if pergunta == 'resistencia' or pergunta == 'Voltagem' or pergunta == 'corrente':
    if pergunta == 'resistencia':
       n1 = int(input("Informe a voltagem:"))
       n2 = int(input("Informe a corrente:"))
       resposta = n1 / n2
       print('A resistencia eh:' = str(resposta))
   else pergunta == 'Voltagem':
       r1 = int(input("Informe a resistencia: "))
       r2 = int(input("Informe a corrente: "))
       resultado = r1 * r2
       print('A voltagem eh:' + str(resultado))
   else pergunta == 'corrente':
       v1 = int(input(" Informe a voltagem: "))
       v2 = int(input(" Informe a resistencia: "))
       calc + v1 / v2 
       print('A corrente eh: ' + str(calc))
else: 
    print('opcao errada')
    print("")
    print("As opcoes sao:")
    print("")
    print("-Resistencia")
    print("")
    print("-Voltagem")
    print("")
    print("-Corrente")

