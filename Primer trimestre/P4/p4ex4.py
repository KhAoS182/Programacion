#Práctica 4 - Ejercicio 4 - Adrian Garcia
#Datos Saber el factorial dun nombre
a = int(input("Ingresar un numero: "))
b=1
for x in range (1,a):
    b=b+(b*x)
    if x==a-1:
        print ("El factorial de %d es: %d" %(a,b))     
        