class Cachorro(object):
    def __init__(self, r, n, i, p):
        self.__raca = r
        self.__nome = n
        self.__idade = i
        self.__peso = p
    
    def getRaca(self):
        return self.__raca
        
    def getNome(self):
        return self.__nome

    def getIdade(self):
        return self.__idade

    def setIdade(self, i):
        self.__idade = i

    def getPeso(self):
        return self.__peso

    def setPeso(self, p):
        self.__peso = p
     
    def status(self):
         print('*** Características do cachorro ***')
         print('Raça: ' + str(self.__raca))
         print('Nome: ' + str(self.__nome))
         print('Idade: ' + str(self.__idade))
         print('Peso: ' + str(self.__peso))

def main():
    c1 = Cachorro('Rotweiller', 'Riley', 5, 35.9)
    c1.status()

    c1.setIdade(c1.getIdade() + 1)
    print('Idade: ' + str(c1.getIdade()))

main()
        

