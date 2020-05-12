
x = float(input("Informe o lado do cubo: ")) 

n = float(input("Informe a altura do paralelepipedo: "))
u = float(input("Informe o comprimento do paralelepipedo: "))
s = float(input("Informe o profundidade do paralelepipedo: "))

q = float(input("Informe a base do oone: "))
w = float(input("Informe a altura do cone: "))


e = float(input("Infome o raio da esfera: "))

r = x*x*x

t = n*u*s


y = (3.14 * (q/2)**2 * w)/3

i =  4/3 * 3.14 * e**3

print("Volume do cubo: " + str(r))
print("Volume do paralelepipedo: " + str(t))
print("Volume do cone: " + str(y))
print("Volume da esfera: " + str(i))

 
