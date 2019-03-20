#Práctica 6 - Ejercicio 3 - Adrian Garcia
#Datos Crear una llista i despres subtituir una paraula de la llista.
llista=[]
b=0
a=int(input("Cuantas palabras tiene la lista: "))
for i in range(0,a):
    c=str(input("Escriu una paraula:"))
    llista.append(c)
print(llista)
d=input("Substituir la palabra: ")
e=input("por la palabra: ")
while d in llista:
    llista[llista.index(d)]=e
print(llista)