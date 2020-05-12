print("Lei de Ohms")
opcao = input("informe o que deseja calcular?")

if opcao == "resistencia":
    voltagem1 = float(input("digite a voltagem: "))
    corrente1 = float(input("digite a corrente: "))
    totalres = voltagem1/corrente1
    print("a resistencia total eh: " +str(totalres))
elif opcao == "voltagem":
    corrente2 = float(input("digite a corrente: "))
    resistencia2 = float(input("digite a resistencia: "))
    totalvolt = corrente2*resistencia2
    print("a voltagem eh de: " +str(totalvolt))
elif opcao == "corrente":
    voltagem3 = float(input("digite a voltagem: "))
    resistencia3 = float(input("digite a resistencia: "))
    totalcor = voltagem3/resistencia3
    print("a corrente total eh: " +str(totalcor))



