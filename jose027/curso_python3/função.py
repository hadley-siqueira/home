print('Função')

vezes = int(input('Quantas vezes você deseja calcular média?:'))

def calcularMedia(peso1 = 3, peso2 = 5, peso3 = 2, peso4 = 6):
    
    p_nota = float(input('Digite a primeira nota: '))
    s_nota = float(input('Digite a segunda nota: '))
    t_nota = float(input('Digite a terceira nota: '))
    q_nota = float(input('Digite a quarta nota: '))
    media = (p_nota * peso1) + (s_nota * peso2) + (t_nota * peso3) + (q_nota * peso4) / (peso1 + peso2 + peso3 + peso4)
    print(media)

for c in range(0, vezes):
    calcularMedia()





