#Práctica 7 - Ejercicio 5 - Adrian Garcia
#Datos Preguntar una frase y un vocal que subtituya todas las demas.
def f(x,y):
    llista=["a","e","i","o","u"]
    for i in llista:
        x = x.replace (i,y)
    return x
a=str(input("Dime alguna frase: "))
b=str(input("Dime la vocal: "))
print (f(a,b))
