idade = int(input("Qual a sua idade? "))

if idade >= 18:
    t = input("Voce ja tem carteira de motorista? ")
    if t in ("s", "S", "Sim", "sim"):
        print("Voce ja pode dirigir")
    else:
        print("Voce nao pode dirigir")
else:
    print("Voce nao pode dirigir")
