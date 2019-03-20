#Práctica 5 - Ejercicio 1 - Adrian Garcia
#Datos Crear una lista de strings y guardarlas hasta que pulsemos intro.
lista=[]
a=str(input("Introdueix una paraula a la llista: "))
while (a!=""):
    lista.append(a)
    a=str(input("Introdueix una paraula a la llista: "))
print(lista)