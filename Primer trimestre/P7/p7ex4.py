#Práctica 7 - Ejercicio 4 - Adrian Garcia
#Datos Pedir una frase y subtituir los espacios por asteriscos.
def ex4(x):
    x=(x.replace(" ","*"))
    return print (x)
a=input("Dime alguna frase: ")
ex4(a)