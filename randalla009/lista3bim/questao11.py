print(">> LEI DE OHM <<")
print("Resistencia, tensão ou corrente")
l = input("O que você precisa calcular?")
if l=="resistencia":
    t = float(input("Digite a tensão:"))
    i = float(input("Digite a corrente:"))
    r = t/i
    print("A resistencia é " + str(r) + "ohm")
elif l=="tensão":
    r = float(input("Digite a resistencia:"))
    i = float(input("Digite a corrente:"))
    t = r*i
    print("A tensão é " + str(t) + " volt")
elif l=="corrente":
    r = float(input("Digite a resistencia:"))
    t = float(input("Digite a tensão:"))
    i = t/r
    print("A corrente é " + str(i) + " ampere")
else:
    print("As opções são: resistencia, tensão ou corrente!")

