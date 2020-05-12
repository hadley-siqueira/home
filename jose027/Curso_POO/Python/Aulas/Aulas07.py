class Conta(object):
    def __init__(self, n, s):
        self.numero = n
        self.saldo = s

    def status(self):
        print('Número: ' + str(self.numero))
        print('Saldo: ' + str(self.saldo))

    def __sub__(self, outro):
        self.saldo -= outro.saldo

def main():
    print('*** Métodos especiais ***')
    bradesco = Conta(2017, 700000)
    itau = Conta(2018, 200000)
    bradesco - itau
    print(bradesco.saldo)

main()
