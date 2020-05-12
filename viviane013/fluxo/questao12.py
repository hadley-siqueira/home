produto1 = str(input("Informe o primeiro produto: "))
preco1 = int(input("Informw o preco:"))
produto2 = str(input("Informe o segundo produto: "))
preco2 = int(input("Informe o preco:"))
if preco1 > preco2:
    print('O produto mais caro: ' + str(produto1))
elif preco1 < preco2:
    print('O produto mais caro: ' + str(produto2))
else:
    print('Os produtos tem o mesmo preco')


