print('*** Ordem dos números ***')
num1 = int(input('Digite o primeiro número: ')) 
num2 = int(input('Digite o segundo número: ')) 
num3 = int(input('Digite o terceiro número: ')) 

if (num1 < num2 and num1 < num3) and num2 < num3:
    print('| ' + str(num3) +', ' + str(num2) + ', '  + str(num1) + ' |')
elif (num2 < num1 and num2 < num3) and num1 < num3:
    print('| ' + str(num3) +', ' + str(num1) + ', '  + str(num2) + ' |')
elif (num3 < num2 and num3 < num1) and num2 < num1:
    print('| ' + str(num1) +', ' + str(num2) + ', '  + str(num3) + ' |')
elif (num3 < num1 and num3 < num2) and num1 < num2:
    print('| ' + str(num2) +', ' + str(num1) + ', '  + str(num3) + ' |')
 
   
    
