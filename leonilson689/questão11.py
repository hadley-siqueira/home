print ('   LEI DE OHM    ')
print ('resistencia, tensão ou corrente')
l = input('o que você vc precisar calcular?')
if l=='resistencia':
    t = float(input('digite a tensão:'))
    i = float(input('digite a corrente'))
    r = t/i
    print('a resistencia é ' +str(r) +'ohm')
elif l=='tensão':
    r = float(input('digite a resistencia'))
    i = float(input('digite corrente'))
    t = r*i
    print('a tensão é:' + str(t)+'ohm')
elif l=='corrente':
    r = float(input('digite a resistencia'))
    t = float(input('digite a tensão'))
    i = t/r
    print('a corrente é: ' + str(i) + 'ohm'))
else:
    print(' a infomação está errada')

