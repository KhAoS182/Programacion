#Práctica 4 - Ejercicio 2 - Adrian Garcia
#Datos Saber que numeros son pares e impares
a = int(input("Ingresar un numero: "))
b = int(input("Ingresar un numero mayor: "))
if (a>b or a==b):
    print ("Error")
else:
    for x in range (a,b+1):
        if (a%2==0):
            print (a, "es par")
        else:
            print (a, "es impar")
        a=a+1