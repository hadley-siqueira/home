class Pessoa(object):
    def __init__(self, n, i):
        self.nome = n
        self.idade = i

    def fazerAniversario(self):
        self.idade += 1
        print(self.nome + ' fez aniversário')
        print('Idade: ' + str(self.idade) + ' anos')

class Aluno(Pessoa):
    pass

def main():
    nome = str(input('Digite o nome do aluno: '))
    idade = int(input('Digite a idade do aluno: '))
    
    a = Aluno(nome, idade)
    a.fazerAniversario()

    if issubclass(Aluno, Pessoa):
        print('A classe aluno é subclasse de pessoa')
    else:
        print('A classe aluno não é subclasse de Pessoa')

main()
