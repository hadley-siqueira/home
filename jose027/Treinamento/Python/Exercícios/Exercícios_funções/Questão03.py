def taxaImposto(t, v):
    print('preço do produto: R$' + str(v * (1 + (t / 100))) + ' reais')

def main():
    valor = float(input('Digite o valor do produto desejado: '))
    taxa = int(input('Digite a taxa de imposto do produto desejado: '))
    taxaImposto(taxa, valor)

main()
