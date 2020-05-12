a, b, c, = input().split()
a= int(a)
b= int(b)
c= float(c)
e, f, g = input().split()
e = int(e)
f = int(f)
g= float(g)
h = b * c
l = f * g
s = h + l
print("VALOR A PAGAR: R$ " + str('{:.2f}'.format(s)))
