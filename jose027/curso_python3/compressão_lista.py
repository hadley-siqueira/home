import random
print('*** Compressão de listas ***')

l1 = [x + 10 for x in range(10)]
print('*** Primeira lista ***')
print(l1)

l2 = [random.randint(1, 100) for i in range(30) if i % 2 == 0]
print('*** Segunda lista ***')
print(l2)
