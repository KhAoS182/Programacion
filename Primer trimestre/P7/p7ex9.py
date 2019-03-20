#Práctica 7 - Ejercicio 9 - Adrian Garcia
#Datos Preguntar 2 palabras y verificar que riman o no.
def ex9(x,y):
    a=0
    c="No riman"
    x=x[::-1]
    y=y[::-1]
    for i in range(0,3):
        if x[i] == y[i]:
            a=a+1
        elif i==0 and a<=0:
            return c
    if a >=3:
        c="Sí riman"
    elif a ==2:
        c="riman un poco"
    return c
a=input("Dime una palabra: ")
b=input("Dime otra palabra: ")
print ("Las palabras %s i %s"%(a,b),ex9(a,b))