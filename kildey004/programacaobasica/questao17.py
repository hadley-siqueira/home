print("Valor em moedas")

um = float(input("Qtd de moedas de 1¢: "))
cinco = float(input("Qtd de moedas de 5¢:"))
dez = float(input("Qtd de moedas de 10¢:"))
vinte = float(input("Qtd de moedas de 25¢:"))
cinqt = float(input("Qtd de moedas de 50:"))
real = float(input("Qtd de moedas de R$1,00:"))

t1 = um * 0.01
t2 = cinco * 0.05
t3 = dez * 0.10
t4 = vinte * 0.25
t5 = cinqt * 0.50
t6 = real * 1.00

total = t1 + t2 + t3 + t4 + t5 + t6

print("Dinheiro total: R$" + str(total))
