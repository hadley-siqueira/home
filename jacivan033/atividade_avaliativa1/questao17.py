print("Calcular o dinheio")
u = float(input("Infome a quantidade de moedas de 1 centavo: "))
c = float(input("Informe a quantidade de moedas de 5 centavos: "))
d = float(input("Informe a quantidade de moedas de 10 centavos: "))
v = float(input("Informe a quantidade de moedas de 25 centavos: "))
k = float(input("Informe a quantidade de moedas de 50 centavos: "))
s = float(input("Informe a quantidade de moedas de 1 real: "))
w = u * 0.01
u = c * 0.05
q = d * 0.10
a = v * 0.25
z = k * 0.50
t = s * 1.00
f = w + u + q + a + z + t
print("O dinheiro economizado eh " + str(f))
