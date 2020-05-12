    def imprimirMatriz(matriz):
    for contad in range(0, 3, +1):    
        for con in range(0, 3, +1):
            print(matriz[contad][con], end = ' ')
        print()

def inserirElementos(matriz):
    for c in range(0, 3, +1):
        for cont in range(0, 3, +1):
            try:
                elemento = int(input('Digite um elemento na linha ' + str(c + 1) + ' coluna ' + str(cont + 1) + ' da matriz: '))
                matriz[c][cont] = elemento
            except ValueError:
                print('elemento digitado inválido')
                matriz[c][cont] = 0

def main():
    print('*** Matriz ***')

    matriz = [[None, None, None],[None, None, None],[None, None, None]]
    matriz2 = [[None, None, None],[None, None, None],[None, None, None]]
    matriz3 = [[None, None, None],[None, None, None],[None, None, None]]

    inserirElementos(matriz)
    inserirElementos(matriz2)

    for c in range(0, 3, +1):
        for cont in range(0, 3, +1):
            matriz3[c][cont] = matriz[c][cont] + matriz2[c][cont]
            
    matrizes = [matriz, matriz2, matriz3]
    for contad in range(0, 3, +1):
        print('*** Matriz ' + str(contad + 1) + ' ***')
        imprimirMatriz(matrizes[contad])

main()
