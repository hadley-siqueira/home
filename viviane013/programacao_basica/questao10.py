print("Convertor de segundos")
hora = int(input("Diga-me a hora: "))
minuto = int(input("diga-me o minuto: "))
segundo = int(input("diga-me os segungos: "))
convhora = hora * 3600
convminutos = minuto * 60
total = convhora + convminutos + segundo
print('o total de segundos eh de: ' + str(total))

