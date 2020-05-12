import math
def conversaoBase(n, base):
    d_hexadecimal = {10:'A', 11:'B', 12:'C', 13:'D', 14:'E', 15:'F'}
    vetor = []
    
    if base == 2 or base == 8:    
        while n >= base: 
            vetor.insert(0, math.trunc(n % base))
            n /= base 
        vetor.insert(0, math.trunc(n)) 
    
    elif base == 16:
        if n in d_hexadecimal:
            return d_hexadecimal.get(n)
        elif n >= 0 and n <= 9:
            return n
        while n >= 16:
            vetor.insert(0, math.trunc(n % 16))
            n /= 16
        vetor.insert(0, math.trunc(n))

        for c in vetor:
            if c in d_hexadecimal:
                vetor[vetor.index(c)] = d_hexadecimal.get(c)
    
    return vetor
     
def conversaoDecimal(n, base):
    d_hexadecimal = {'A':'10', 'B':'11', 'C':'12', 'D':'13', 'E':'14', 'F':'15'}
    numero_decimal = 0
    v_num = ['1', '2', '3', '4', '5', '6', '7', '8', '9']

    vetor_conversao = []

    numero_string = str(n)

    for c in range(0, len(numero_string), +1):
        vetor_conversao.insert(c, numero_string[c])
        if vetor_conversao[c] not in v_num:
            for cont in d_hexadecimal.keys():
                 if vetor_conversao[c] == cont:
                    vetor_conversao[c] = d_hexadecimal.get(cont)
                        
    for contad in range(len(vetor_conversao) - 1, -1, -1):
        numero_decimal += math.trunc(int(vetor_conversao[contad]) * math.pow(base, math.fabs(contad - c)))
    return numero_decimal

def operacaoBases(base):
    qtd_num = int(input('Quantos números você deseja digitar?: '))
    
    vetor_algarismos = []
    soma = 0
    mult = 1
    
    for c in range(0, qtd_num, +1):
        n = str(input(str(c + 1) + '° número: '))
        vetor_algarismos.insert(c, conversaoDecimal(n, base))
        soma += conversaoDecimal(n, base)
        mult *= conversaoDecimal(n, base)
        vetor_algarismos.sort()

    subt = vetor_algarismos[len(vetor_algarismos) - 1]
    
    for contad in range(0, len(vetor_algarismos) - 1, +1):
        subt -= vetor_algarismos[contad]

    vetor_algarismos.clear()
    
    vetor_algarismos.append(conversaoBase(soma, base))
    vetor_algarismos.append(conversaoBase(mult, base))
    vetor_algarismos.append(conversaoBase(subt, base))     
    
    return vetor_algarismos
        
def main():
    print(conversaoBase(2020, 2))
    print(conversaoBase(2020, 8))
    print(conversaoBase(2020, 16))
    #print(conversaoDecimal(1111101000, 2))
    #print(conversaoDecimal('3F9', 16))
    #print(operacaoBases(2))
    #print(operacaoBases(8))
    #print(operacaoBases(16))
   
main()

