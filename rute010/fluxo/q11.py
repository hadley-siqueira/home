p = input("O que você quer calcular?")

if p == "voltagem":
    r = float(input("Digite a resistencia:"))
    i = float(input("Digite a corrente:"))
    v = r * i
    print("A tensão é " + str(v) + " V")
else:
    if p == "resistencia":
        v = float(input("Digite a tensão:"))
        i = float(input("Digite a corrente:"))
        r = v/i
        print("A resistencia é " + str(r) + " ohm")
    else:
        if p == "corrente":
            v = float(input("Digite a tensão:"))
            r = float(input("Digite a resistencia:"))
            i = v/r
            print("A corrente é " + str(i) + " A")

