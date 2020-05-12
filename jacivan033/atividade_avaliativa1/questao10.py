print("Programa leitor de segundos ")
h = int(input("Informe a quantidade de horas:"))
m = int(input("Informe a quantidade de minutos:"))
s = int(input("informe a quantidade de segundos:"))
d = h * 3600
a = m * 60
q = a + d + s
print("Os segundos são: " + str(q))
