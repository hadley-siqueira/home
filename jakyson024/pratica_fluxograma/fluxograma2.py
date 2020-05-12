print("** Calculadora de Gastos**")
saldo = float(input("digite quanto dinheiro voce tem"))
preco = float(input("Digite o preco unitario do produto:"))
qtd = int(input("Digite a quantidade a ser comprada:"))

if saldo < preco*qtd:
    print("ihh, voce nao tem dinheiro")
else:
    if saldo > preco * qtd:
        troco = saldo - preco*qtd
        print("Voce tem dinheiro para comprar e ainda sobra troco!!")
        print("O troco sera de " + str(troco))
    else:
        print("Vce tem dineiro para comprar")

