print('*** Calculadora ***')

def somar(n1, n2):
    return n1 + n2

def subtrair(n1, n2):
    return n1 - n2

def multiplicar(n1, n2):
    return n1 * n2

def dividir(n1 , n2):
    return n1 / n2 

def main():
    print('** Opções disponíveis **')
    opcoes = ['Soma', 'Subtração', 'Multiplicação', 'Divisão']
    
    for c in opcoes:
        print('* ' + str(c) + ' *')
    
    opcao = input('Digite a operação desejada: ')
    while opcao.capitalize() not in opcoes:
        print('A opção digitada não está presente nas opções disponíveis, digite novamente')
        opcao = input('Digite a operação desejada: ')
    
    n1 = int(input('Digite o primeiro número: '))
    n2 = int(input('Digite o segundo número: '))
    
    funcoes = (somar(n1, n2), subtrair(n1, n2), multiplicar(n1, n2), dividir(n1, n2))

    for c in range(0, len(funcoes), + 1):
        if opcao.capitalize() == opcoes[c]:
            print(funcoes[c])
    

main()

