print("** calculadora de gastos **")
saldo =float(input("digite quanto dinheiro voce tem: "))
preco =float(input("digite o preco unitario do produto: "))
qtd= int(input("digite a quantidade a ser comprada: "))


if saldo < preco * qtd:
     print("ihh, voce nao tem dinheiro o suficiente para compra") 
else: 
    if saldo > preco * qtd:
         print("voce tem dinheiro para comprar") 
    else:
         troco = saldo - preco * qtd
         print("voce tem dinheiro pra compra e ainda sobra troco!!")
         print("o troco sera de " + str(troco)) 

