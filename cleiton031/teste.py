print("** Calculadora de Gastos **")
saldo = float(input("Digite quanto dinheiro voce tem:"))
preco = float(input("Digite o preço unitário do produto:"))
qtd = int(input("Digite a qauntidade a ser comprada:"))

if saldo < preco * qtd:
    print("ihh, voce nao tem dinheiro o suficiente para comprar")
else:
    if saldo > preco * qtd: 
       troco = saldo - preco * qtd
       print("Voce tem dinheiro para comprar e ainda sobra troco!!")
       print("O troco sera de" + str(troco))
