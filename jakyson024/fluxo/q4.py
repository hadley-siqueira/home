n1 = int(input('digite o n1: '))
n2 = int(input('digite o n2: '))
n3 = int(input('digite o n3: '))

if n1 < n2 and n1 < n3:
    print(' n1 eh o menor')
elif n2 < n1 and n2 < n3:
    print('n2 eh o menor')
else:
    print(' n3 eh o menor')
