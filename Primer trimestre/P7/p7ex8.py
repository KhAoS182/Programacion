#Práctica 7 - Ejercicio 8 - Adrian Garcia
#Datos Preguntar una frase y quitar todos los espacios.
def ex8(x):
    x = x.replace(" ","") 
    return x   
a=input("Dime alguna frase: ")
print (ex8(a))