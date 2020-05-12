print("  calculando de gasto ")
saldo = float(input("digite quanto dinheiro voce tem:"))
preco = float(input("digite o preço unitario do produto:"))
qtd = int(input("digite a quantidade a ser comprada:"))
if saldo < preco * qtd:
    print("ihh,voce nao tem dinheiro o suficiante para comprar")
else:
    if saldo > preco * qtd:
        print("vc tem dinheiro para comprar")
    else:
        troco = saldo - preco * qtd
        print("voce tem dinheiro para comprar e ainda sobra troco!!")
        print("o troco sera de " + str(troco))
        
