def verificacaoNumero(n):
    if n > 0:
        return 'P'
    else:
        return 'N'

def main():
    print('*** Positivo e negativo ***')
    n = int(input('Digite o número desejado: '))
    print(verificacaoNumero(n))

main()

