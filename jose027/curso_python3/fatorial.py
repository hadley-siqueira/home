print('Função fatorial')

n = int(input('Digite o número desejado: '))

def fatorial(n):
    if n == 1:
        return n
    return fatorial(n - 1) * n
print(fatorial(n))
