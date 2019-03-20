#Práctica 7 - Ejercicio 7 - Adrian Garcia
#Datos Preguntar una frase y contar todas las voales que tiene la frase.
def ex7(x):
    e=0
    llista=["a","e","i","o","u"]
    llista2=[]
    for i in llista:
        for n in x:
            if n ==i:
                e=e+1
        llista2.extend((i,e))
        e=0
    return llista2
a=input("Escribe una frase: ")
print (ex7(a))