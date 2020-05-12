print("Contador de moedas")
moedas = float(input("Quantas moedas de um  centavo voce tem? "))
um = 0.1

moeda = float(input("Quantas moedas de cinco centavos voce tem? "))
cinco =  0.5

moed = float(input("Quantas moedas de dez centavos voce tem? "))
dez = 0.10

moe = float(input("Quantas moedas de vinte e cinco centavos voce tem? "))
vinte = 0.25

mo = float(input("Quantas moedas de cinquenta centavos voce tem? "))
cinq = 0.50

m = float(input("Quantas moedas de um real voce tem? "))
real = 1

prim = moedas * um
seg = moeda * cinco
terc = moed * dez
quar = moe * vinte
quin = mo * cinq
sex = m * real

calc = prim + seg + terc + quar + quin + sex
print("o total de dinheiro que voce tem eh: " + str(calc))


