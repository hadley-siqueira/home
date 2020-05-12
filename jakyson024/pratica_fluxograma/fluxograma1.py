print("** Calcuradora de Gastos **")
saldo = float(input("Digite quando dinheiro voce tem?"))
preço = float(input("Digite o preço unitário do produto:"))
qtd = int(input("Digite a quantidade a ser comprada:"))

if saldo < preço*qtd:
    print("ihh, você não tem dinheiro o suficiente para comprar")
else:
    if saldo > preço*qtd:
        troco = saldo - preço*qtd
        print("você tem dinheiro para comprar e ainda sobra troco!!")
        print("O troco será de R$" + str(troco))
    else: 
        print("Voce tem dinheiro para comprar")

   

   
