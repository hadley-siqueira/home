print(" >>Calculadora de nota<< ")

n = float(input(" Informe sua nota do primeiro bimestre: " ))
l = float(input(" Informe sua nota do segundo bimestre: " ))
h = float(input(" Informe sua nota do terceiro bimestre: " ))
a = float(input(" Informe sua nota do quarto bimestre: " ))
e = float(input(" Informe o peso do primeiro bimestre: " ))
k = float(input(" Informe o peso do segundo bimestre: " ))
u = float(input(" Informe o peso do terceiro bimestre: " ))
p = float(input(" Informe o peso do quarto bimestre: " ))

b = n * e + l * k + h * u + a *p
z = e + k + u + p
y = b/z

print(" Sua média ponderada é: " + str(y))
