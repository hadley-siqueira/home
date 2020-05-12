x = input("O que você deseja calcular:")

if x == "resistencia":
    v = float(input("Qual a tensão?"))
    i = float(input("Qual a corrente?"))
    r = v/i
    print ("A resitencia é de " + str(v) + "ohms")
else:
    if x == "voltagem":
        r = float(input("Qual a resistencia?"))
        i = float(input("Qual a corrente?"))
        v = r * i
        print("A voltagem é de " + str(v) + "Volts")
    else: 
        if x == "corrente":
            v = float(input("Qual a tensão?"))
            r = float(input("Qual a resistencia?"))
            c = v/r
            print ("A corrente é de " + str(c) + "Amperes")
        else:
            print("Voce digitou uma opçao errada. As opções são: resistencia, voltagem, corrente")

