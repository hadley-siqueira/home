print("lei de ohm")
m = input("digite o que deseja calcular:")
if m == "resistência":
    v =  float(input("informe a tensão:"))
    i =  float(input("informe a corrente:"))
    r =  v/i
    print("a sua resistência é:" + str(r))
elif m == "corrente":
    v = float(input("informe a tensão:"))
    r = float(input("informe a resistência:"))
    i = v/r
    print("a corrente é:"+ str(i)) 
elif m == "tensão":
    r = float(input("informe a resistência:"))
    i = float(input("informe a corrente:"))
    v = r*i
    print("a tensão é:" + str(v))
else:
    print("opção incorreta")
    print("opção válidas são:")
    print("resistência")
    print("corrente")
    print("tensão")
