print("calcular o dinheiro")
a = float(input(" informe a quantidade de moedas de 1 centavos: "))
b = float(input(" informe a quantidade de moedas de 5 centavos: "))
c = float(input(" informe a quantidade de moedas de 10 centavos: "))
d = float(input(" informe a quantidade de moedas de 25 centavos: "))
e = float(input(" informe a quantidade de moedas de 50 centavos: "))
f = float(input(" informe a quantidade de moedas de 1 real: "))
h = a * 0.01
i = b * 0.05
j = c * 0.10
k = d * 0.25
l = e * 0.50
m = f * 1.00
o = h + i + j + k + l + m 
print(" o dinheiro economizado eh " + str(o))

