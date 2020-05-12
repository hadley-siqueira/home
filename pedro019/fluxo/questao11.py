o = str(input("O que deseja calcular?" ))

if o == 'tensao':
    r = float(input("Digite a resistencia: "))
    i = float(input("Digite a corrente: "))
    v = r * i
    print("A tensao e igual a: " + str(v))
else:
    if o == 'corrente':
         r = float(input("Digite a resistencia: "))
         v = float(input("Digite a tensao: "))
         i = r / v
         print("A corrente e igual a: " + str(i))
    else:    
        if o == 'resistencia':
            v = float(input("Digite a tensao: "))
            i = float(input("Digite a corrente: "))
            r = v * i
            print("a resistencia e igual a: " + str(r))     
            
    
    
