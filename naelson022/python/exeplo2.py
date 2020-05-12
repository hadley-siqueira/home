print('** emprestimo**')
v = float(input(' informe o valor da casa ' ))
s = float(input(' salario do comprador' ))
t1 = float(input(' tempo a pagar em anoss '))
p1 = s * 0.30
t2 = t1 * 12
p2 = v/t2
if p2 <= p1:
    print( ' emprestimo aceito ')
else:
    print(' emprestimo negado ')
