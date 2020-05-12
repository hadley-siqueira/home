print("Cofrinho do Pedrinho")

u = float(input("Informe a qtd de moedas de 1 centavo:"))
c = float(input("Informe a qtd de moedas de 5 centavos:"))
d = float(input("Informe a qtd de moedas de 10 centavos:"))
v = float(input("Informe a qtd de moedas de 25 centavos:"))
ci = float(input("Informe a qtd de moedas de 50 centavos:"))
ur = float(input("Informe a qtd de moedas de 1 real:"))

u2 = u * 0.01
c2 = c * 0.05
d2 = d * 0.10
v2 = v * 0.20
ci2 = ci * 0.50
ur2 = ur * 1.00

r = u2 + c2 + d2 + v2 + ci2 + ur2

print( )
print("O resultado total de dinheiro eh:" + str(r))
