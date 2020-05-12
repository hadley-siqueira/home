print("Compre sua camisa")
pequena = int(input("Diga-me quantas camisas P deseja: "))
p = 10
medio = int(input("Diga-me quantas camisas M deseja: "))
m = 12
grande = int(input("Diga-me  quantas camisas G deseja: "))
g = 15

calcp = pequena * p
calcm = medio * m
calcg = grande * g

todo = calcp + calcm + calcg
print("O total da compra eh de: " + str(todo))

