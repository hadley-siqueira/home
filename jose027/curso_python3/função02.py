print('Função02')

bimestre1 = float(input('Digite a nota do primeiro bimestre: '))
bimestre2 = float(input('Digite a nota do segundo bimestre: '))
bimestre3 = float(input('Digite a nota do terceiro bimestre: '))  
bimestre4 = float(input('Digite a nota do quarto bimestre: '))

def media_anual(bimestre1, bimestre2, bimestre3, bimestre4):
    média = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4
    
    return média

m = media_anual(bimestre1, bimestre2, bimestre3, bimestre4)
print(m)

