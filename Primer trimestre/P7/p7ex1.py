#Práctica 7 - Ejercicio 1 - Adrian Garcia
#Datos Escribir en mayusculas y minisculas la palabra o frase introducida.
a=input("Escribeme algo: ")
def ex1(a):
    a= a.lower()
    print (a)
    a = a.upper()
    print (a)
ex1(a)