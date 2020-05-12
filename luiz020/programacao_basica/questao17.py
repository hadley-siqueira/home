print(" Programa de Moedas ")

a = int(input("Informe a quantidade de moedas de 1 centavo: "))

b = int(input("Informe a quantidade de moedas de 5 centavos: "))

c = int(input("Informe a quantidade de moedas de 10 centavos: "))

d = int(input("Informe a quantidade de moedas de 25 centavos: "))

e = int(input("Informe a quantidade de moedas de 50 centavos: "))

f = int(input("Informe a quantidade de moedas de 1 real: "))

g = a * 0.01 + b * 0.05 + c * 0.10 + d * 0.25 + e * 0.50 + f * 1

print("O valor total economizado: " + str(g))
