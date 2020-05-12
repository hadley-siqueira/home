class Pessoa():
    def __init__(self, n, i, p, a):
        self.nome = n
        self.idade = i
        self.peso = p
        self.altura = a

    def envelhecer(self):
        self.idade += 1
        self.crescer()

    def engordar(self):
        self.peso += 1

    def emagrecer(self):
        self.peso -= 1

    def crescer(self):
        if self.idade < 21:
            self.altura += 0.05
    
    def status(self):
        print('Nome: ' + str(self.nome))
        print('Idade: ' + str(self.idade))
        print('Peso: ' + str(self.peso))
        print('Altura: ' + str(self.altura))

def main():
    nome = str(input('Digite o nome desejado: '))
    idade = int(input('Digite a idade desejada: '))
    peso = int(input('Digite o peso desejado: '))
    altura = float(input('Digite a altura desejada: '))

    p1 = Pessoa(nome, idade, peso, altura)
    p1.status()
    p1.envelhecer()
    p1.status()

main()    
