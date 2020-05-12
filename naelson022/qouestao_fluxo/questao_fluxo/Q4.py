n1 = int(input(" informe o n1: "))      
n2 = int(input(" informe o n2: "))      
n3 = int(input(" informe o n3: "))  
if n1 < n2:
    if n1 < n3:
        print(" o menor eh " + str(n1))
    else:
        print(" o menor eh " + str(n3))
else:
    if n2 < n3:
        print(" o menor eh " + str(n2))
    else:
        print(" o menor eh " + str(n3))
