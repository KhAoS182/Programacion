#Práctica 6 - Ejercicio 10 - Adrian Garcia
#Datos Saber el divisors d'un nombre.
llista=[]
a= int(input('Introduce numero: '))
while a!= "":      
    b=0
    for i in range (1,a+1):      
        if (a%i==0):
            b=b+1
            llista.append(i)
    print (a,"te %d divisors"%(b),llista,)
    llista.clear()
    a= input('Introduce numero: ')