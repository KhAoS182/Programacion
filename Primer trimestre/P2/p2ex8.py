dia = int(input("Escribe el dia: "))
if (dia <=31):
    mes = int(input("Escribe el mes: "))   
    año = int(input("Escribe el año: "))

    if (mes == 2):
        if (dia > 28):    
            print ("Error: La fecha no es valida.")
        elif (dia <= 28):
            print ("La fecha es: ",dia," / ",mes," / ",año)

    if (mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12):
        print ("La fecha es: ",dia," / ",mes," / ",año)        
        
    if (mes == 4 or mes == 6 or mes == 9 or mes == 11):
        if (dia > 30):
            print ("Error: La fecha no es valida.")
        else:
            print ("La fecha es: ",dia,"/",mes,"/",año)  
else:
    print ("Error: La fecha no es valida")
    