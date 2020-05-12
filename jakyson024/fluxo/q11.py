p = input('o que voce quer calcular? ')

if p == 'voltagem':
    r = float(input('digite a resistencia: '))
    i = float(input('digite a corrente: '))
    v = r * i
    print('a tensao eh '+ str (v) + 'V'
else:
    if p == 'resistencia':
        v = float(input('digite a tensao: '))
        i = float(input('digite a corrente: '))
        r = v/i
        print(' a restitencia eh ' + str (r) + 'omh')
    else:
        if p == 'corrente':
            v = float(input('digite a tensao: '))
            r = float(input('digite a resistencia: '))
            i = v/r
            print('a corrente eh ' + str(i) + 'A')
