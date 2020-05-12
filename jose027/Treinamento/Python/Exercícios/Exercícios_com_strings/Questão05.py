print('*** Data ***')

d = str(input('Digite a data: '))
mes = ('Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro')

for c in range(0, 12, +1):
    if int(d[3: 5]) == c + 1:
        print(str(d[0: 2]) + ' de ' + str(mes[c]) + ' de ' + str(d[6: len(d)]))
        break


