print('*** Forca ***')

palavra_secreta = ['P','A','R','A','L','E','L','E','P','Í','P','E','D','O']

ganhou = False

letras_digitadas = []
palavra_adivinhada = ['_','_','_','_','_','_','_','_','_','_','_','_','_','_']

for c in palavra_secreta:
    print(c, end = '')
print()

while ganhou == False:
    letra = str(input('Digite a letra desejada: '))
    
    while letra in letras_digitadas:
        print('A letra já foi digitada, digite novamente')
        letra = str(input('Digite a letra desejada: '))
    
    while len(letra) >= 2:
        print('Você digitou mais de uma letra em uma jogada, digite novamente')
        letra = str(input('Digite a letra desejada: ') ) 
    letras_digitadas.append(letra)

    for c in range(0, len(palavra_secreta), +1):
        if letra.upper() == palavra_secreta[c]:
            palavra_adivinhada.insert(palavra_secreta.index(palavra_secreta[c]), letra.upper())
            for c in palavra_adivinhada:
                print(c, end = ' ')
            print()

    
