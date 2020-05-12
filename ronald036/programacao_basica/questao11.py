print("** MÉDIA PONDERADA DOS ALUNOS IFRN**")
nota1 = int(input("Digite a primeira nota: "))
nota2 = int(input("Digite a segunda nota: "))
nota3 = int(input("Digite a terceira nota: "))
nota4 = int(input("Digite a quarta nota: "))
nota_total = nota1 + nota2 + nota3 + nota4
Média_ponderada = nota1 * 7.0 + nota2 * 5.0 + nota3 * 6.0 + nota4 * 9.5/nota_total
print("A média ponderada e de " + str(Média_ponderada))
