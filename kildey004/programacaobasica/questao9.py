print("**calculadora de gastos**")

x = float(input("digite quanto voce tem para gastar em R$: "))

xs = float(input("digite quanto era um salgado: "))

sa = float(input("digite quanto e um salgado agora: "))

tsa = x / sa

txs = x / xs

print( "antes voce compraria " + str(txs) + " salgados")
print("agora voce pode comprar " + str(tsa) + " salgados")
