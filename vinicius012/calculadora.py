print("*** Calculadora do Vinicius ***")
n1 = float(input("Digite o primeiro numero: "))
n2 = float(input("Digite o segundo numero: "))
op = input("Digite a operacao: ")

if op == '+':
    print(str(n1) + " + " + str(n2) + " = " + str(n1 + n2))
elif op == '-':
    print(str(n1) + " - " + str(n2) + " = " + str(n1 - n2))
elif op == '*':
    print(str(n1) + " * " + str(n2) + " = " + str(n1 * n2))
elif op == '/':
    print(str(n1) + " / " + str(n2) + " = " + str(n1 / n2))
