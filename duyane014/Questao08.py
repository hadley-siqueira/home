print("contador de volume das formas")
altura = int(input("informe o numero para a altura do paralelepipedo: "))
comprimento = int(input("informe o numero para comprimento: "))
largura = int(input("informe o numero para largura: ")) 
calculo = altura * comprimento * largura 
print("o volume do paralelepipedo eh: " + str(calculo)) 

alt = int(input("informe o numero para o lado do cubo: ")) 
larg = int(input("informe o numero para a largura: ")) 
calc = alt * larg 
print("o volume do cone eh: " + str(calc)) 

comp = int(input("informe o numero para o volume do cone: ")) 
al = int(input("informe a altura: "))
cal = comp * al 
print("o volume do cone eh: " + str(cal)) 

esfera = int(input("informe o numero para a esfera: ")) 
raio = int(input("informe o numero para o raio: ")) 
divi = esfera / raio 
print("o raio da esfera eh: " + str(divi))  
