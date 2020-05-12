a = int(input("informe o primeiro numero: "))
b = int(input("informe o segundo numero: "))
c = int(input("informe o terceiro numero: "))

if a < b:
    if a < c:
        print('os numeros estao em ordem crescente')
else:
    if b > c:
        print('os numeros  não estao em ordem crescente')
if c < b:
     print('os numeros nao estao em ordem crescente')
 
