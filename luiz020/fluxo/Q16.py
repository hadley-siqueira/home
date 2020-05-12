k1 = int(input("Digite o primeiro número: "))
k2 = int(input("Digite o segundo número: "))
k3 = int(input("Digite o terceiro número: "))

if k1 + k2 == k3:
    print("Os dois primeiros números somados resultam no terceiro número")
elif k1 + k3 == k2:
    print("O primeiro e o terceiro somados resultam no segundo")
elif k2 + k3 == k1:
    print("Os dois últimos números somados resultam no primeiro número")
else:  
    print("Nenhuma soma") 
  
