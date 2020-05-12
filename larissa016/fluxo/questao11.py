print(">>> LEI DE OHM<<<")
print("Resistencia,tensao ou corrente")
l = input("O que voce precisa calcular?")
if l=="resistencia":
    t = float(input("Digite a tensão:"))
    i = float(input("Digite a corrente:"))
    r = t/i
    print("A resistencia é " + str(r) + " ohm")
elif l=="tensao":
    r = float(input("Digite a resistencia:"))
    i = float(input("Digite a corente:"))
    t = r*i
elif l=="corrente":
    r = float(input("Digite a resistencia:"))
    t = float(input("Digite a tensão:"))
    i = t/r
    print("A corente é " + str(i) + " ampere")
else:
    print("As opções são: resistencia, tensao ou corrente!") 

