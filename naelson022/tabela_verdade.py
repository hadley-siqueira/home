a = int(input(" informe A: "))
b = int(input(" informe B: "))
c = a + b * 2

r1 = c > 5 and  b> 1
print("r1 = " + str(r1))
r2 = b == c and (not( b == c))
print(" r2 = " + str(r2))
r3 = ( a == 0 and b == 0 ) or (not(c == 0))
print("r3 = " + str (r3))

