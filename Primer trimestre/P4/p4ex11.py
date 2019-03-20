#Práctica 4 - Ejercicio 11 - Adrian Garcia
#Datos Saber el divisors d'un nombre
a= int(input('Introduce numero: '))
print ("Els divisors de %d son: "%(a),end="")
for i in range (1,a+1):
    if (a%i==0):
        print (i,end=" ")