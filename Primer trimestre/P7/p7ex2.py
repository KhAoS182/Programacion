#Práctica 7 - Ejercicio 2 - Adrian Garcia
#Datos Pedir nombre completo en 3 strings diferentes y leugo juntarlas.
def ex2(a,b,c):
    d=a+" "+b+" "+c
    return d
a=input("Dime tu nombre: ")
b=input("Dime tu primer apellido: ")
c=input("Dime tu segundo apellido: ")
print(ex2(a,b,c))