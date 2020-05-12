print(" >>Calcule  o dinheiro do cofrinho<< ")
a = float(input(" Informe a quantidade de moedas de 1 centavos: "))
b = float(input(" Informe a quantidade de moedas de 5 centavos: "))
c = float(input(" Informe a quantidade de moedas de 10 centavos: "))
d = float(input(" Informe a quantidade de moedas de 25 centavos: "))
e = float(input(" Informe a quantidade de moedas de 50 centavos: "))
f = float(input(" Informe a quantidade de moedas de 1 real: "))
g = a * 0.01
a = b * 0.05
h = c * 0.10
a = d * 0.25
i = e * 0.50
j = f * 1.00
k = g + a + h + a + i + j
print(" O dinheiro economizado é: " + str(k)) 
