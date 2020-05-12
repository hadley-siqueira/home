print(" >> Poupança do cofrinho << ")
qtd1c = float(input(" Qual a quantidade de moedas de 1 centavos: "))
qtd5c = float(input(" Qual a quantidade de moedas de 5 cenatvos:"))
qtd10c = float(input(" Qual a quantidade de moedas de 10 centavos: "))
qtd25c = float(input(" Qual a quantidade de moedas de 25 centavos: "))
qtd50c = float(input(" Qual a quantidade de moedas de 50 centavos:"))
qtd1r = float(input(" Qual a quantidade de moedas de 1 real: "))

total = qtd1c * 0.01 + qtd5c * 0.05 + qtd10c * 0.10 + qtd25c * 0.25 + qtd50c * 0.5 + qtd1r

print(" O cofre tem:" + str(total))

