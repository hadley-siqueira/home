p = input("Oque voce quer calcular?")

if p == "Voltagem":
    r = float(input("Digite a resistencia:"))
    i = float(input("Digite a corrente:"))
    v = r * i
    print("A tensão e " + str(v) + " V")
else:
    if p == "resistencia":
        v = float(input("Digite a tensão:"))
        i = float(input("Digite a corrente:"))
        r = v/i
        print("A resistencia e " + str(r) + " omh")
    else:
        if p == "corrente":
            v = float(input("Digite a tensão:"))
            r = float(input("Digite a resistencia:"))
            i = v/r
            print("A corrente e " + str(i) + " A")
