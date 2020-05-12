hora = int(input("digite uma hora: "))
if hora < 23:
    hora = hora + 1
else:
    hora = 0

print("A proxima hora eh " + str(hora))

