print("convertor de segundos") 
hora = int(input("diga-me a hora: "))
minuto = int(input("diga-me o minuo: "))
segundo = int(input("diga-me os segundos: ")) 
convhora = hora * 3600
convminuto = minuto * 60
total = convhora + convminuto + segundo 
print("o total de segundo eh de: " + str(total)) 
