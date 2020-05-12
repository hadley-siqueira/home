print("***NOME E PREÇO DOS PRODUTOS***")
r = str(input("informe o primeiro produto:"))
o = float(input("informe o preço do primeiro produto:"))
n2 = str(input("informe o segundo produto:"))
a2 = float(input("informe o preço do segundo produto:"))
if o > a2 or o == a2:
    if o > a2:    
        print("o primeiro produto é o mais caro:")
    
    if o == a2:
         print("os produtos tem o mesmo preço")
else:
    print("o segundo produto é o mais caro")

