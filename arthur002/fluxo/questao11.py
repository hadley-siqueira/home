n = input(" informe  o que voce quer? ")
if n == "resistencia":
    v = float(input("informe a tensão: "))
    i = float(input(" iforme a corrente: "))
    r = v / i
    print(" a resistencia eh " + str(r))
elif n ==  "corrente":
    v = float(input("informe a tensão: "))
    r = float(input("informe  a resistencia: "))
    i = v / r
    print(" a corrente eh " + str(i))
elif  n == "tensão":
    i = float(input(" informe a corrente: "))
    r = float(input(" informe a resistencia: "))
    v = r * i
    print(" a tensao eh " + str (v))
else:
    print("opçao incorreta ")
    print("opções validas sao: ")
    print(" resistencia")
    print(" corrente ")
    print(" tensao ")

