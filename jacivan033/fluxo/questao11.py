p = input("O que voce quer calcular?")

if p == "voltagem":
    r = float(input("Digite a resistencia:"))
    i = float(input("digite a corrente:"))
    v = r * i
    print("A tensao eh " + str(v) + "v")
else:
    if p == "resistencia":
        v = float(input("digite a tensao:"))
        i = float(input("Digite a corrente:"))
        r = v/i 
        print("A resistencia é " + str(r) + " ohm")
    else:
        if p == "Corrente":
            v = float(input("Digite a tensao:"))
            r = float(input("Digite a resistencia:"))
            i = v/r
            print("a corrente eh " +  str(i) + " A")
