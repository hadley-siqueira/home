print("Calculadora de media ponderada ")
n = float(input("Informe a nota do primeiro bimestre: "))
l = float(input("Informe a notra do segundo bimestre: "))
h = float(input("Informe a nota do terceiro bimestre: "))
a = float(input("Informe a nota do quarto bimestre: "))
e = float(input("Informe o peso do primeiro bimestre: "))
k = float(input("Informe o peso do segundo bimestre: "))
u = float(input("Informe o peso do terceiro bimestre: "))
p = float(input("Informe o peso do quarto bimestre: "))
o = n * e + l * k + h * u + a * p
z = e + k + u + p
y = o/z
print("Sua media ponderada eh: " + str(y))
