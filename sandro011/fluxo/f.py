a = 2
b = 3
c = a * a + b
r1 = not(not(c>10))
r2 = a==b or (a>b and c>10)
r3 = a<b or (not(c>10))
print("r1" + str(r1))
print("r2" + str(r2))
print("r3" + str(r3))

