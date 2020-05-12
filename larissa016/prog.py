a = 2
b = 3
c = a + b * 2 
r1 = c > 5 and b > 1
r2 = b==c and (não(b==c))
r3 = (a==0 and b==0) or (not (c==0))
print("r1 = " + str(r1))
print("r2 = " + str(r2))
print("r3 = " + str(r3))
