A = 2
B = 3
C = A + B * 2

r1 = C > 5 and B > 1
r2 = B == C and (not (B ==C))
r3 = (A==0 and B==0) or (not(C==0))

print("r1 = " + str(r1))
print("r2 = "+str(r2))
print("r3 = "+str(r3))
