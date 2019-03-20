#Práctica 6 - Ejercicio 9 - Adrian Garcia
#Datos Crear 1 llista i ometre les repetides.
llista=[]
llista2=[]
a=int(input("Cuantas palabras tiene la lista: "))
for i in range(0,a):
    c=str(input("Escriu una paraula: "))
    llista.append(c)
print("La primera llista es: ",llista)
for e in llista:
    if e not in llista2:
        llista2.append(e)
print ("La lista sin repeticiones:",llista2)