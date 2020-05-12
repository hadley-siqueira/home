def reverterNumero(n):
    n_string = str(n)
    return n_string[len(n_string) - 1: 1: -1]

def main():
    print('*** Número reverso **')
    n = int(input('Digite o número desejado: '))
    print(reverterNumero(n))

main()
