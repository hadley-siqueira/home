print("** programa adivinha **") 
print("digite tres numeros e eu vou dizer qual deles eh o maior")
n1 = int(input("digite o segundo numero: "))
n2 = int(input("digite o segundo numero: "))
n3 = int(input("digite o terceiro numero: "))

if n1 > n2:
    if n1 > n3:
        print("o maior numero eh o " + str(n1))

