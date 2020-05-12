n1 = int(input("Informe o n1:"))
n2 = int(input("Informe o n2:"))
n3 = int(input("Informe o n3:"))
if n1 < n2:
    if n1 < n3:
        print("O menor eh " + str(n1))
    else:
        print("O menor eh " + str(n3))
else:
    if n2 < n3:
        print("O menor eh " + str(n2))
    else:
        print("O menor eh " + str(n3))
