#Práctica 4 - Ejercicio 11 - Adrian Garcia
#Datos sense break, saber si un nombre es prim o no
a= int(input('Dame un numero: '))
b=0
for i in range (2,a-1):
    if (a%i==0):
        b=b+1
if (b<1):
        print ("El numero %s es primo"%(a))
else:
        print ("El numero %s no es primo"%(a))
