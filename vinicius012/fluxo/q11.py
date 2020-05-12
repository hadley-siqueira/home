op = input("O que voce deseja calcular: ")

if op == 'resistencia' or op == 'resistência' or op == 'r':
    v = float(input("Digite a voltagem: "))
    i = float(input("Digite a corrente: "))
    r = v / i
    print('A resistencia eh de ' + str(r) + ' ohms')
elif op == 'corrente' or op == 'c':
    v = float(input("Digite a voltagem: "))
    r = float(input("Digite a resistencia: "))
    i = v / r
    print("A corrente e de " + str(i) + " ampéres") 
elif op == "v" or op == "tensao" or op == "tensão" or op == "voltagem" :
    r = float(input("Digite a resistemcia: "))
    i = float(input("Digite acorrente: "))
    v = r * i 
    print("A tensao e e de " + str(v) + "volts")
else:
    print("As unicas opçoes sao")
    print("-resistencia")
    print("-voltagem")
    print("-corrente")
