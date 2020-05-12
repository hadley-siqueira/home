n = input(" informe  o que voce que? ")
if n == "resistencia":
    v = float(input("informe a tensa: "))
    i = float(input(" iforme a corente: "))
    r = v / i
    print(" a resistencia eh " + str(r))
elif n ==  "corrente":
    v = float(input("informe a tensa: "))
    r = float(input("informe  a resistencia: "))
    i = v / r
    print(" a corrente eh " + str(i))
elif  n == "tensao":
    i = float(input(" informe a corrente: "))
    r = float(input(" informe a resistencia: "))
    v = r * i
    print(" a tensao eh " + str (v))
else:
    print("opçao incorreta ")
    print("opçao validas sao: ")
    print(" resistencia")
    print(" corrente ")
    print(" tensao ")

