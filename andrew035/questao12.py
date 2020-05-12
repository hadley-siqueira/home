p = int(input("Informe quantas camisas pequenas você quer: "))
m = int(input("Informe quantas camisas médias você quer: "))
g = int(input("Informe quantas camisas grandes você quer: "))

cp = p * 10
cm = m * 12
cg = g * 15
total = cp + cm + cg

print("O valor arrecadado será de: " + str(total))
