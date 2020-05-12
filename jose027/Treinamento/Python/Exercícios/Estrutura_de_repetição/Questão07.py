from time import sleep
print('*** Números ímpares ***')
for c in range(3, 51, + 1):
    if c % 2 == 0:
        continue
    print(c)
    sleep(1)

