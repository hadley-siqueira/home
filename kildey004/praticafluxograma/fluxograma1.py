print("** Calculadora de gastos **")
saldo = float(input("Digite o dinheiro que voce tem: "))
preço = float(input("Digite o preço unitario do produto: "))
qtd = int(input("digite a quantidade a ser comprada: "))


if saldo < preço:
    print("Ihh, voce nao tem dinheiro suficiente para comprar")
else: 
    if saldo > preço * qtd:
        troco = saldo - preço * qtd
        print("Voce tem dinheiro para comprar e ainda sobra troco!")
        print("O troco sera de " + str(troco))
    else:
        saldo == preço * qtd
        print("Voce tem o dinheiro certo pra comprar!")
