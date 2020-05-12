print(" >> Média ponderada do ano letivo << ")
p1 = int(input("Digite o peso do 1° bimestre: "))
p2 = int(input("Diigte o peso do 2° bimestre: "))
p3 = int(input("Digite o peso do 3° bimestre: "))
p4 = int(input("Digite o peso do 4° bimestre: "))
print("-------------------------------------------")
n1 = float(input(" Digite a nota do 1° bimestre: "))
n2 = float(input(" Digite a nota do 2° bimestre: "))
n3 = float(input(" Digite a nota do 3° bimestre: "))
n4 = float(input(" Digite a nota do 4° bimestre: "))

ma1 = p1 * n1
ma2 = p2 * n2
ma3 = p3 * n3
ma4 = p4 * n4

soma = ma1 + ma2 + ma3 + ma4 
divisor = p1 + p2 + p3 + p4 

MEDIA = soma / divisor 

print(" A média ponderada é: " + str(MEDIA))

