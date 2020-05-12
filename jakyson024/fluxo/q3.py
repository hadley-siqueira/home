n1 = int(input('digite o n1: '))
n2 = int(input('digite o n2: '))
n3 = int(input('digite o n3: '))

if n1 > n2 and n1 > n3:
    print('O maior eh o primeiro')
elif n2 > n3 and n2 > n1:
    print('O maior eh o segundo')
else:
    print('O maior eh o terceiro')
    
