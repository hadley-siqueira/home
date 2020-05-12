print('*** Empresa Tabajara ***')

s = float(input('Digite o seu salário: '))
while s <= 0:
    print('Salário inválido, digite novamente')
    s = float(input('Digite o seu salário: '))

if s > 0 and s <= 280:
    reaj = 20
    aum = s * (1 + 0.2) 
    v_aum = aum - s 
elif s > 280 and s <= 700:
    reaj = 15
    aum = s * (1 + 0.15) 
    v_aum = aum - s
elif s > 700 and s <= 1500:
    reaj = 10
    aum = s * (1 + 0.1)
    v_aum = aum - s
else:
    reaj = 5
    aum = s * (1 + 0.05)
    v_aum = aum - s

print('Salário antes do reajuste: R$' + str(s) + ' reais')
print('Aumento: ' + str(reaj) + '%')
print('Valor do aumento: R$' + str(v_aum) + ' reais')
print('Salário pós reajuste: R$' + str(aum) + ' reais')
 
