print("LEI DE OHM")
print("Resistencia,tensão ou corrente")
a = input("O que você precisa calcular?")
if a=="Resistencia":
    b = float(input("Digite a tensão:"))
    c = float(input("Digite a corrente:"))
    d = b/c
    print("A resistencia é" + str(d) + "OHM")
elif a=="tensão":
    c = float(input("Digite a resistencia:"))
    b = float(input("Digite a corrente:"))
    e = c*b
    print("A tensão é" + str(e) + "VOLT")
elif a=="corrente":
    d = float(input("Digite a resistencia:"))
    b = float(input("Digite a tensão:"))    
    f = d/b
    print("A corrente é" + str(f) + "Ampere")
else:
    print("As opções são: resistencia,tensão ou corrente!")
