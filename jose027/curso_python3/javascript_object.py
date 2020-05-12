import json

pessoa = {'Nome': 'Pedro', 'Idade': 17, 'RG': 1034, 'CPF': 9092929345}
pessoa_string = json.dumps(pessoa)
print(pessoa_string)
pessoa = json.loads(pessoa_string)
print(pessoa)

