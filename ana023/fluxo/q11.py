x = input("o que você deseja calcular: ")

if x == "resistencia":
    v = float(input("qual a tensão?"))
    i = float(input("qual a corrente?"))
    r = v/i
    print ("a resistencia é de " + str(v) + "ohms")
else:
    if x == "voltagem":
        r = float(input("qual a resistencia?"))
        i = float(input("qual a corrente?"))
        v = r * i
        print("A voltagem é de " + str(v) + "volts")
    else:
        if x == "corrente":
            v = float(input("qual a tensão?"))
            r = float(input("qual a resistencia?"))
            c = r/v
            print("a corrente é de " + str(c) + "Amperes")
        else:
            print("você digitou uma opção errada. As opções são: resistencia, voltagem e corrente")

