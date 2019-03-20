#Práctica 6 - Ejercicio 5 - Adrian Garcia
#Datos Crear 2 llistes una de noms i l'altre que borri els noms de la primera llista.
llista=[]
llista2=[]
a=int(input("Cuantas palabras tiene la lista: "))
for i in range(0,a):
    c=str(input("Escribe la palabra: "))
    llista.append(c)
print("La lista creada es: ",llista)
g=int(input("Quantas palabras tenemos que eliminar: "))
for x in range (1,g+1):
    d=input("Dime la palabra %d: "%(x))
    llista2.append(d)
    while d in llista:
        llista.remove(d)
print ("La lista a borrar es:",llista2,"\n","La llista final es ahora: :",llista)