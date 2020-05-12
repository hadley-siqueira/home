class Mamifero(object):
    def __init__(self, nome, pelo, andar, genero):
        self.nome = nome
        self.pelo = pelo
        self.andar = andar
        self.genero = genero
    
    def falar(self):
        print(str(self.nome) + ' falou')
    
    def anda(self):
        print('Andando sobre ' + str(self.andar) + ' patas')
    
    def status(self):
        print('Nome: ' + str(self.nome))
        print('Pelo: ' + str(self.pelo))
        print('Número de patas: ' + str(self.andar) + ' patas')
        print('Gênero: ' + str(self.genero))

class Pessoa(Mamifero):
    def _init__(self, nome, pelo, andar, genero, cabelo):
        super(Pessoa, self).__init__(nome, pelo, andar, genero)
        self.cabelo = cabelo
        print('Cor do cabelo: ' + str(self.cabelo))
    
    def status():
        super(Pessoa, self).status()
        print('Cor do cabelo: ' + str(cabelo))
    
    def falar():
        print('Ola sou ' + str(self.nome) + ' e sei falar')

def main():
    m1 = Mamifero('Leão', 'Amarelo', 4, 'M')
    m1.status()
    m1.falar()
    m1.anda()
    
    p1 = Pessoa('Fernandes', 'Loiro', '2', 'F' 'Preto')
    p1.status()
    p1.falar()
    p1.anda()

main()    
       
        
