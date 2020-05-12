print("**calendario da Fabrica**")

d = int(input("Informe a qtd total de dias:"))

a = d//360
m = (d - a * 360)//30
d = d - a * 360 - m * 30

r = a + m + d

print("A qtd de anos sem acidentes são:" + str(a))
print("A qtd de meses sem acidentes são:" + str(m))
print("A qtd de dias sem acidentes são:" + str(d))

