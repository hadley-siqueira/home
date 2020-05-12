print("  calculadora  ")
saldo = float(input("digite quanto dinheiro voce tem: "))
preço = float(input("digite o preço unitario do produto: "))
qtd = int(input("digite a quantidade a ser comprada"))
if saldo < preço*qtd:
    print("ihh,voce nao tem dinheiro o suficiente para compra ")
else:
    if saldo > preço*qtd:
        troco = saldo-preço*qtd
        print("voce tem dinheiro para comprar e ainda sobra troco!!")
        print("o  troco sera de " + str(troco))
    else:
        print("voce tem dinheiro para comprar")
