def conversaoHora(hora, minutos):
    if hora >= 13:
        hora -= 12
        return str(hora) + ':' +  str(minutos) + ' P.M'
    return str(hora) + ':' +  str(minutos) + ' A.M'

def main():
    hora = int(input('Digite a hora desejada: '))
    minutos = int(input('Digite o minuto desejado: '))
    print(conversaoHora(hora, minutos))

main()
  
     
        
        
