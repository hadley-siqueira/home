def corretorString(string):
    string.strip()
   
    for c in range(0, len(string), +1): 
        while string[c] == ' ' and string[c + 1] == ' ':
            string_correta = string.replace(string[c + 1], '')
            break

    return string_correta

def main():
    print('*** Comprimento de strings ***')
    
    s1 = str(input('Digite a primeira palavra: '))
    s2 = str(input('Digite a segunda palavra: '))

    print(corretorString(s1))
    print(corretorString(s2))

    if len(corretorString(s1)) != len(corretorString(s2)):
        print('As strings são diferentes')
    else:
        for c in range(0, len(corretorString(s1)), +1):
            if corretorString(s1)[c] != corretorString(s2)[c]:
                print('As strings são diferentes')
                break
    
    print('Número de caracteres na primeira palavra: ' + str(len(corretorString(s1))) + ' caracteres')
    print('Número de caracteres na segunda palavra: ' + str(len(corretorString(s2))) + ' caracteres')

main()
