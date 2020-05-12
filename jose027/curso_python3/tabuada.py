print('*** Tabuada ***')
começo = int(input('Digite o começo desejado: '))
fim = int(input('Digite o fim desejado: '))
if começo < fim:
    for c in range(começo, fim+1, 1):
        print('Para o ' + str(c) + ': ')
        for con in range(1,11, 1):
            print(str(c) + ' X ' + str(con) + ' = ' + str(c*con))
elif começo > fim:
    for c in range(começo, fim-1, -1):
        print('Para o ' + str(c) + ': ')
        for con in range(1,11, 1):
            print(str(c) + ' X ' + str(con) + ' = ' + str(c*con))
print('Operação da tabuada realizada com sucesso!') 


    
