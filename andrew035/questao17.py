n = float(input("Informe a quantidade em 1 centavos: "))
s = float(input("Informe a quantidade em 5 centavos: "))
d = float(input("Informe a quantidade em 10 centavos: "))
c = float(input("Informe a quantidade em 25 centavos: "))
e = float(input("Informe a quantidade em 50 centavos: "))
r = float(input("Informe a quantidade em 1 real: "))

q = n * 0.01
w = s * 0.05
t = d * 0.10
y = c * 0.25
u = e * 0.50
o = r * 1.00

reais = q + w + t + y + u + o

print("A quantidade de dinheiro em reais é: " + str(reais))
