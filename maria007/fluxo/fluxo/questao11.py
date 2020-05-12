a = input(" O que voce que calcular?")

if a == "resistencia": 
    v = float(input("Qual a tensão? "))
    i = float(input("Qual a corrente? "))
    r = v / i
    print("A resistencias é de "+str(r)+" ohms")
else:
    if a == "tensao":
       r = float(input("Qual a resistencia? "))
       i = float(input("Qual a corrente? "))
       v = r * i
       print("A tensão é de "+ str(v)+" Volts")
    else:
        if a == "corrente":
            v = float(input("Qual a tensao? "))
            r = float(input("Qual a resistencia? "))
            i = v / r
            print(" A corrente é de"+ str(i)+" Ampers")
        else:
            print("Você digitou a opção errada!As opções são: resistencia, tensão ou corrente.") 

    

