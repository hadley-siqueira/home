print("** Programa calculador do quanto foi economizado**")
u = float(input("Digite a quantidade de moedas de 1 centatavo: "))
c = float(input("Digite a quantidade de moedas de 5 centavos: ")) 
d = float(input("Digite a quantidade de moedas de 10 centavos: "))
v = float(input("Digite a quantidade de moedas de 25 centavos: "))
cc = float(input("Digite a quantidade de moedas de 50 centavos: "))
r = float(input("Digite a quantidade de moedas de 1 real: "))
uu = u * 0.01
co = c * 0.05
dd = d * 0.1
vv = v * 0.25
ccc = cc * 0.50
rr = r * 1.0

to = uu + co + dd + vv + ccc+ rr
print("A quantidade total que pedrinho poupou foi " + str(to))
