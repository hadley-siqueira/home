print("calcular o dinheiro")
u = float(input(" informe a quantidade de moedas de  1 centavos: "))
c = float(input(" informe a quantidade de moedas de 5 centavos : "))
d = float(input(" informe a quantidade de moedas de 10 centavos: " ))
v = float(input(" informe a quantidade de moedas de 25 centavos: "))
k = float(input(" informe a quantidade de moedas de 50 centavos: "))
s = float(input(" informe a quantidade de moedas de 1 real: "))
w = u * 0.01
u = c * 0.05
q = d * 0.10
a = v * 0.25
z = k * 0.50
t = s * 1.00
f = w + u + q + a + z + t
print(" o dinheiro econimizado eh " + str(f))


