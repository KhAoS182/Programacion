mes = float(input("Escribe el mes: "))
dia = float(input("Escribe el dÃ­a: "))
ano = float(input("Escribe el aÃ±o: "))
if (mes == 2):
    if (dia > 28):    
        print ("Error: La fecha no es vÃ¡lida.")
    elif (dia <= '28'):
        print ("La fecha es: ",dia," / ",mes," / ",ano)
        
if (mes == 1 or mes == 3 or mes == 5 or mes == '7' or mes == '8' or mes == '10' or mes == '12'):
    if (dia <= '31'):
        print ("La fecha es: ",dia," / ",mes," / ",ano)
    elif (dia > '31'):
        print ("Error: La fecha no es vÃ¡lida.")
        
if (mes == '4' or mes == '6' or mes == '9' or mes == '11'):
    if (dia > '30'):
        print ("Error: La fecha no es vÃ¡lida.")