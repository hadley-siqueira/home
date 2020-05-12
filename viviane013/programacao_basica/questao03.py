print('calculador de casamentos e certidoes')
qtd_casamentos = int(input('informe a qtd de casamentos: '))
qtd_certificados = int(input('informe a qtd de certidoes: '))
preco_casamento = 250
preco_certidao = 30
total = qtd_casamentos * preco_casamento + qtd_certificados * preco_certidao
print(' o total eh ' + str(total))
