print('*** filter ***')

l1 = filter((lambda x: x % 2 == 0), range(5))
print(l1)
print(list(l1))
