A = 2
B = 3
C = A + B * 2

R1 = C > 5 and B > 1
R2 = B == C and (Not(B == C))
R3 = (A == 0 and B==0) or (not(C == 0))

print("R1 = " + str(R1))
print("R2 = " + str(R2))
print("R3 = " + str(R3))

