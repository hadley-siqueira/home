pn1 = str(input("Informe o nome do primeiro produto: "))
pv1 = float(input("Informe o valor do primeiro produto: "))
pn2 = str(input("Informe o nome do segundo produto: "))
pv2 = float(input("Informe o valor do segundo produto: "))

if pv1 > pv2:
    print("O produto mais caro é o/a " + str(pn1))
else:
    if pv2 > pv1:
        print("O produto mais caro é o/a " + str*(pn2))
    else: 
        if pv2 == pv1:
            print("Os dois produtos tem o mesmo preço")
