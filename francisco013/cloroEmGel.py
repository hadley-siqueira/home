import random

print("Jogo da adivinhacao")
V = random.randint(0, 100)

while True:
   n = int(input("Digite um numero: "))
   if n > V:
      print("Você errou, o numero eh menor! kkkk Burro")
   elif n < V:
       print("Você errou, o numero eh maior! kkkk Burro")
   else:
       print("Acertou! Que cagada...")
       break
