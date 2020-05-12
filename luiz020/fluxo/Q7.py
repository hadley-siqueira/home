k1 = int(input("Digite o primeiro número: "))
k2 = int(input("Digite o segundo número: "))
k3 = int(input("Digite o terceiro número: "))

if k1 < k2 and k2 < k3:
    if k1 < k2:
        print("Está em Ordem Crescente") 
    else:
        print("Não está em Ordem Crescente")
        if k2 < k3:    
            print("Está em Ordem Crescente") 
        else:
            print("Não está em Ordem Crescente")

else:
    print("Não está em Ordem Crescente") 
