n = input(" qual grandeza voce quer medir? ")
if n == "resistencia":
    v = float(input("digite a tensão: "))
    i = float(input("digite a corrente: "))
    r = v / i
    print(" a resistencia eh " + str(r))
elif n ==  "corrente":
    v = float(input("digite a tensão: "))
    r = float(input("digite  a resistencia: "))
    i = v / r
    print(" a corrente eh " + str(i))
elif  n == "tensão":
    i = float(input("digite a corrente: "))
    r = float(input(" digite a resistencia: "))
    v = r * i
    print(" a tensao eh " + str (v))
else:
    print("opçao incorreta,opçoes disponiveis: resistencia, corrente, tensao")
