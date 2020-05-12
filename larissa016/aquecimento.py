print(" **programa adivinhador**")
print("digite tres numeros e eu eu vou dizer qual deles eh op maior")
n1 = int(input("digite o primeiro numero: "))
n2 = int(input("digite o segundo numero: "))
n3 = int(input("digite o terceiro numero "))

if n1 > n2:
    if n1 > n3:
        print("O maior numero eh o "+ str(n1))
    else:
        print("O maior numero eh o "+ str(n3))
else:
    if n2> n3:
       print("o maior numero eh o"+ str(n2))
    else:
       print("o maoir numero eh o"+ str(n3))

resp = input("acertei?")

if resp == "sim":
    print("ihh,to mal")
else:
    print("Aee")
 
    
  
