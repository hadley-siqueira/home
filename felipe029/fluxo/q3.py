n1 = int(input("Digite o primeiro nuemro:"))
n2 = int(input("Digite o segundo numero:"))
n3 = int(input("Digite o terceiro numero:"))

if n1 > n2 and n2 > n3:
    print("O maior eh o " + str(n1))
elif n2 > n3:
    print("O maior eh o " + str(n2))
else:
    print("O maior eh o " + str(n3))
