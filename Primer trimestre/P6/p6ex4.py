#Práctica 6 - Ejercicio 4 - Adrian Garcia
#Datos Crear 1 llista i eleminar un paraula dins la llista.
llista=[]
a=int(input("Cuantas palabras tiene la lista: "))
for i in range(0,a):
    c=str(input("Escribe una palabra: "))
    llista.append(c)
print(llista)
d=input("Dime la palabra: ")
while d in llista:
    llista.remove(d)
print(llista)