print("** Media ponderada dos alunos IFRN **")
nota1 = float(input("Digite a nota do primeiro bimestre: "))
nota2 = float(input("Digite a nota do segundo bimestre: "))
nota3 = float(input("Digite a nota do terceiro bimestre: "))
nota4 = float(input("Digite a nota do quarto bimestre: "))
nota_total = nota1 + nota2 + nota3 + nota4
media_ponderada = nota1 * 7.0 + nota2 * 5.0 + nota3 * 6.0 + nota4 * 9.5/nota_total
print("A média ponderada é de " + str(media_ponderada))
