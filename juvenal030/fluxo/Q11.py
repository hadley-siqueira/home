p = str(input("informe o que voce quer calcular"))

if p == 'Tensao' or p == 'tensao':
    r = float(input("informe a resistencia: "))
    i = float(input("informe a corrente: "))
    v = r * i
    print("a tensao é igual a: " + str(v))
else:
    if p == 'Corrente' or p == 'corrente':
        v = float(input("informe a tensao: "))
        r = float(input("informe resistencia: "))
        i = v/r
        print("a corrente é igual a: " + str(i))
    else:
        if p == 'Resistencia' or p == 'resistencia':
            v = float(input("informe a tensao: "))
            i = float(input("informe a corrente: "))
            r = v/i
            print("a resistencia é igual a: " + str(r))

