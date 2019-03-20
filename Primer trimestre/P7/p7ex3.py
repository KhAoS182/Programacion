#Práctica 7 - Ejercicio 3 - Adrian Garcia
#Datos Pedir una frase y que escriba 1 letra en cada linea.
a=input("Dime alguna frase: ")
b=len(a)
def ex3(a,b):
    for i in range(0,b):
        print(a[i])
ex3(a,b)
