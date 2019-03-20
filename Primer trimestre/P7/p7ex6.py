#Práctica 7 - Ejercicio 6 - Adrian Garcia
#Datos Preguntar una frase, luego un caracter y que verificque si esta en esa frase.
def f(x,y):
    if y in x:
        return "Si esta"
    else:
        return "No esta"
a=str(input("Dime el nombre: "))
b=str(input("Dime el caracter: "))
print (f(a,b))