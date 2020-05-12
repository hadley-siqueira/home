print("**  Seguradora xyz  **")
print("     >> Sistema de avaliação <<  ")
q = 2300
w = 3500
x = int(input("Qtd de contratos simples: "))
y = int(input("Qtd de contratos completos: "))
resul0 = x * q * 0.1
resul1 = w * y * 0.1
total = resul0 + resul1
print((" Lucro Total: R$") + str(total))
