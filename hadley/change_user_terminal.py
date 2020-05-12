import os

users = open('users.txt').read().split()

for user in users:
    print('Changing shell to user {}'.format(user))
    os.system('sudo chsh -s /bin/bash {}'.format(user))
