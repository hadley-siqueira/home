import random
nome = input('Qual seu nome?')

animal_nome = input('Escreva o nome de um animal:')
objeto_nome = input('Escreva o nome de um objeto:')
fruta_nome = input('Escreva o nome de uma fruta:')

animal = 'girafa','macaco','cachorro','barata','gato','papagaio','elefante','urso','leão'
q_animal = len(animal)
q_animal = q_animal - 1

objeto = 'lápis','borracha','auto-falante','escova','livro','controle','travesseiro'
q_objeto = len(objeto)
q_objeto = q_objeto - 1

fruta = 'maracujá','goiaba','manga','pinha','amora','uva','abacaxi','ameixa','açaí','melancia'
q_fruta = len(fruta)
q_fruta = q_fruta - 1

animal_p1 = animal[random.randint(0,q_animal)]
animal_p2 = animal[random.randint(0,q_animal)]
animal_p3 = animal[random.randint(0,q_animal)]
objeto_p1 = objeto[random.randint(0,q_objeto)]
objeto_p2 = objeto[random.randint(0,q_objeto)]
objeto_p3 = objeto[random.randint(0,q_objeto)]
fruta_p1 = fruta[random.randint(0,q_fruta)]
fruta_p2 = fruta[random.randint(0,q_fruta)]
fruta_p3 = fruta[random.randint(0,q_fruta)]

s = ' '
espaço_nome = 20-(len(nome))*s
espaço_animal_nome = 20-(len(animal_nome))*s
espaço_objeto_nome = 20-(len(objeto_nome))*s
espaço_fruta_nome = 20-(len(fruta_nome))*s


print('PLAYERS            |ANIMAL             |OBJETO             |FRUTA              |')
print('___________________|___________________|___________________|___________________|')
print('{}{}|{}{}|{}{}|{}{}|'.format(nome ,espaço_nome ,animal_nome ,espaço_animal_nome ,objeto_nome ,espaço_objeto_nome ,fruta_nome ,espaço_fruta_nome))
