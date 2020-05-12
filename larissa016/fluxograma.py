print("**Calculadora de Gastos**")
saldo =float(input("Digite quanto dinheiro voce tem:"))
preco=float(input("Digite o preço unitário do produto:"))
qtd=int(input("Digite a quantidade a ser comprada:"))

if saldo < preco * qtd:
    print("ihh,voce nao tem dinheiro o suficiente para comprar")
else:
    if: saldo >preco*qtd:
        troco = saldo - preco * qtd
        print("voce tem dinheiro para comprar e ainda sobra troco!!")
    else:
        print("voce tem dinheiro para comprar")
   
    
