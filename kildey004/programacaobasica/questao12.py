print("**Valor arrecadado em vendas**")

p = int(input("Digite o numero de camisas pequenas vendidas: "))
m = int(input("Digite o numero de camisas medias vendidas: "))
g = int(input("Digite o numero de camisas grandes vendidas: "))

pt = p * 10 
mt = m * 12
gt = g * 15

total = pt + mt + gt

print("o valor arrecadado foi de: R$" + str(total))

