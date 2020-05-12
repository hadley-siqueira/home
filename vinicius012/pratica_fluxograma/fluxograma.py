print ("**Calculadora de Gastos**")
saldo = float(input("digite quanto dinheiro voce tem:"))
preco = float(input("digite o preço unitário do produto:"))
qtd = int(input("digite a quantidade a ser comprada:"))

if saldo<preco*qtd:
   print("ihh,voce nao tem dinheiro o suficiente para comprar")
else:
     if saldo>preco*qtd:
        troco=saldo-preco*qtd
        print("voce tem dinheiro para comprar e ainda sobra troco!!")
        print("o troco sera de"+ str (troco))
     else:
          print("Voce tem dinheiro para comprar") 
