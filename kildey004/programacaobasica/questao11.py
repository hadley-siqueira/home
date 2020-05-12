print("**Calculador de media ponderada**")

n1 = float(input("Digite a primeira nota: "))
p1 = float(input("Digite o peso da primeira nota: "))
n2 = float(input("Digite a segunda nota: "))
p2 = float(input("Digite o peso da segunda nota: "))
n3 = float(input("Digite a terceira nota: "))
p3 = float(input("Digite o peso da terceira nota: "))
n4 = float(input("Digite a quarta nota: "))
p4 = float(input("Digite o peso da quarta nota: "))


tn = n1 * p1 + n2 * p2 + n3 * p3 + n4 * p4

tp = p1 + p2 + p3 + p4

mediap = tn / tp

print("A media da sua nota eh: " + str(mediap))

