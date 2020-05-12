print(" ** programa para calcular dois pontos dos planos cartesianos** ") 
rx = int(input(" Digite um primeiro termo para as suas abcissas: "))
sx = int(input(" Digite o segundo termo para as suas abcissas: "))
ry = int(input(" Digite o primeiro termo para o eixo: "))
sy = int(input(" Digite o segundo termo para as suas abcissas: "))

distância = ((rx - sx) * (rx - sx) + (ry - sy) * (ry - sy)) ** 0.5
print(" A distância euclidiana será igual a " + str (distância))
