k = str(input("O que você deseja calcular? "))

if k == "Resistência":
    v = float(input("Digite o valor da Voltagem: "))
    i = float(input("Digite o valor da Corrente: "))
    r = v/i
    print("A Resistência eh: " + str(r))

elif k == "Voltagem":
    i = float(input("Digite o valor da Corrente: "))
    r = float(input("Digite o valor da Resistência: "))
    v = r * i
    print("A Voltagem eh: " + str(v))

elif k == "Corrente":
    r = float(input("Digite o valor da Resistência: "))
    v = float(input("Digite o valor da Voltagem: "))
    i = v/r
    print("A Corrente eh: " + str(i))    

else:
    print("Essa opção não existe")
    print("O que você pode calcular eh:")
    print("Resistência")
    print("Voltagem")
    print("Corrente")
 
