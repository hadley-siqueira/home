r1 = int(input(" informe r1:"))
r2 = int(input(" informe r2:"))
r3 = int(input(" infomre r3:"))

if r1<r2:
    if r1<r3:
         print("o menor numero é:"+ str (r1))
    
    else:
         if r3<r1:
             print("o menor numero é:"+ str(r3))

else:
    if r2<r3:
         print("o menor numero é:"+str(r2))

    else:
        if r3<r2:
         print("o menor numero é:"+str(r3))
