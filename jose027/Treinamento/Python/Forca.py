print('*** Forca ***')

palavra_secreta = 'BUROCRACIA'
ganhou = False
letras_digitadas = []

palavra_descoberta = []
for c in range(0, len(palavra_secreta), +1):
    palavra_descoberta.append('_')

while ganhou == False:
    letra = str(input('Digite a letra desejada: '))
    
    while letra.upper() in letras_digitadas:
        print('A letra já foi digitada, digite novamente')
        letra = str(input('Digite a letra desejada: '))
    
    letras_digitadas.append(letra.upper())
    print(letras_digitadas)

    for c in range(0, len(palavra_secreta), +1):
        if letra.upper() == palavra_secreta[c]:
            palavra_descoberta[c] = letra.upper()
            for c in palavra_descoberta:
                print(c, end = ' ')
            print()
    
    p_secreta_vetor = list(palavra_secreta)
    if palavra_descoberta == p_secreta_vetor:
        ganhou = True

print('Parabéns, você descobriu a palavra secreta')
  
   
