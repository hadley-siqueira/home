class Administrador(object):
    matricula = 2017
    senha = 123
    def ___init___(self):
        pass

class Professor(object):
    def __init__(self, nome, matricula, disciplina):
        self.nome = nome
        self.matricula = matricula
        disciplina.inserirProfessor(self)
        self.disciplina.nome = disciplina.nome        

class Aluno(object):
    def __init__(self, nome, matricula, turma, endereco):
        self.nome = nome
        self.matricula = matricula
        self.turma = turma
        self.endereco = endereco

    def tirarDuvida(p, duvida):
        pass            

class Disciplina(object):
    professores = []
    def __init__(self, nome):
        self.nome = nome

    def inserirProfessor(self, p):
        if p.disciplina == self.nome:
            professores.append(p)
        
def main():
    print('0-sair')
    print('1-Cadastrar-se')
    print('2-Login')
    
    alunos = []
    professores = []
    usuarios = []

    adm = Administrador()
    
    opcao = int(input('Digite a opção desejada: '))
    if opcao == 1:
       nome = str(input('Digite seu nome: '))
       matricula = int(input('Digite a matricula: '))
       while (len(str(matricula))) != 10 and len(str(matricula)) != 14:
           print('Matricula inválida, digite novamente')
           matricula = int(input('Digite a matricula: '))
       
       senha1 = str(input('Digite a senha: '))
       senha2 = str(input('Confirme a senha: '))
        
       while senha1 != senha2:
           print('Por favor, confirme sua senha corretamente')
           senha2 = str(input('Confirme a senha: '))
       
       print('Cadastro realizado com sucesso')
       
       if len(str(matricula)) == 14:
           print('Você é um aluno')
           turma = str(input('Digite sua turma: '))
           endereco = str(input('Digite seu endereço: '))
           aluno = Aluno(nome, matricula, turma, endereco)
           alunos.append(aluno)   
           usuarios.append(aluno)
       elif len(str(matricula)) == 10:
           print('Você é um professor')
           disciplina = str(input('Digite sua disciplina: '))
           professor = Professor(nome, matricula, disciplina)
           professores.append(professor)
           usuarios.append(professor)
    elif opcao == 2:
        cadastro = False
        adm = Administrador()
        matricula = int(input('Digite a matricula: '))
        senha = str(input('Digite a senha: '))          

        if matricula == adm.matricula and senha == adm.senha:
            adm = Administrador()
            print('Você é o administrador') 
        else:
            if len(usuarios) == 0:
                print('Você não está cadastrado, cadastre-se')
            else:
                for c in range(0, len(usuarios), +1):
                    if matricula == usuarios[c].matricula:
                        print('Login efetuado com sucesso')
                        cadastro = True
                if cadastro == False:
                    print('Você não está cadastrado, cadastre-se')
        
main()
