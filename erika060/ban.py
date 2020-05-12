
print("**calculadora de gastos**")
saldo =float(input("digite quanto dinheiro voce tem: "))
preco =float(input("**digite o preco unitario do produto: "))
qtd =int(input("digite a quantidade a ser comprada: "))

if saldo < preco * qtd:
    print("vc n tem dinheiro")
else:
    if saldo > preco * qtd:
        troco = saldo - preco * qtd
        print("voce tem dinheiro")
        print("troco de " + str(troco))
    else:
        print("tem dinheiro")

