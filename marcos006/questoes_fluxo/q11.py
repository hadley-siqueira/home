p = str(input("O que deseja calcular? "))
if p == "Tensão" or p == "tensão":
    r = float(input("Informe a resistência: "))
    i = float(input("Informe a corrente: "))
    v = r * i
    print("A tensão é igual a " + str(v))
else: 
    if p == "Corrente" or p == "corrente": 
        v = float(input("Informe a tensão: "))
        r = float(input("Informe a resistência: "))
        i = v/r
        print("A corrente é igual à " + str(i))
    else:
        if p == "Resistência" or p == "resistência":
            v = float(input("Informe a tensão: "))
            i = float(input("Informe a corrente: "))
            r = v/i
            print("A resistência é igual à " + str(r))
        else:
            print("Esta opção é inválida!")
            print("As opções são: ")
            print("- Tensão")
            print("- Corrente")
            print("- Resistência")
                                
