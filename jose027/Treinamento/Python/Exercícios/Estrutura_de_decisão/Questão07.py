print('*** Produtos ***')

pro1 = str(input('Informe o primeiro produto: '))
pre1 = float(input('Informe o preço do primeiro produto: '))

pro2 = str(input('Informe o segundo produto: '))
pre2 = float(input('Informe o preço do segundo produto: '))

pro3 = str(input('Informe o terceiro produto: '))
pre3 = float(input('Informe o preço do terceiro produto: '))

if pre1 < pre2 and pre1 < pre3:
    print('Produto a ser selecionado: ' + str(pro1))
if pre2 < pre3 and pre2 < pre1:
    print('Produto a ser selecionado: ' + str(pro2))
if pre3 < pre1 and pre3 < pre2:
    print('Produto a ser selecionado: ' + str(pro3))
