n1 = int(input('Número decimal:'))
rn1 = n1%2
print(rn1)
x = int(n1/2)
y = int(x/2)
while y > 0:
	ry = y%2
	y = int(y/2)
	print(ry) 

