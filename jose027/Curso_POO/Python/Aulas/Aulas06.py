class Conta(object):
    def __init__(self, n, s):
        self.numero = n
        self.saldo = s

    def status():
        print('Dados da conta')
        print('Número: ' + str(self.numero))
        print('Saldo: ' + str(self.saldo))

    def __add__(self, outro):
        self.saldo += outro.saldo

def main():
    print('*** Métodos especiais ***')
    bradesco = Conta(2017, 500000)
    itau = Conta(2018, 200000)
    itau + bradesco
    print(itau.saldo)

main()
