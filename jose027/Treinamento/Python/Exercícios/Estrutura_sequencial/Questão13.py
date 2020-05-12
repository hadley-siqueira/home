print('*** Salário ***')

s_hora = float(input('Digite o seu ganho por hora: '))
h_dia = int(input('Digite a quantidade de horas por dia: '))
s_bruto = s_hora * h_dia * 20
total = 0

print('Salário: bruto R$' + str(s_bruto) + ' reais')

print('IR: R$' + str(s_bruto * 0.11) + ' reais')
total += s_bruto * 0.11

print('INSS: R$' + str(s_bruto * 0.08) + ' reais')
total += s_bruto * 0.08

print('Sindicato: R$' + str(s_bruto * 0.05) + ' reais')
total += s_bruto * 0.05

print('Salário_líquido: R$' + str(s_bruto - total) + ' reais')


