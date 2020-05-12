print("**conversor de horas**")

hora = int(input("Digite a hora: "))
m = int(input("Digite os minutos: "))
s = int(input("Digite os segundos: "))

conversaoh = hora * 3600

conversaom = m * 60

conversaoT = conversaoh + conversaom + s

print(" A hora em segundos é: " + str(conversaoT) + " segundos")
