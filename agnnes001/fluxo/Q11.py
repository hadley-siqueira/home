x = input("O que você deseja calcular?")

if x == "resistencia":
    v = float(input("Qual a tensão?"))
    i = float(input("Qual a corrente?"))
    r = v/i
    print("A resistencia é de " + str(r) + "ohms")
else:
    if x == "voltagem":
        r = float(input("Qual a resistencia?"))
        i = float(input("Qual a corrente?"))
        v = r * i
        print("A voltagem é de " + str(v) + " Volts")
    else:
        if x == "corrente":
            v = float(input("Qual a tensão?"))
            r = float(input("Qual a resistencia?"))
            c = v/r
            print("A corrente é de " + str(c) + " Amperes")
        else:
            print("Você digitou uma opção errada.As opções são:")
            print("- resistencia")
            print("- voltagem")
            print("- corrente") 

