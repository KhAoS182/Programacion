#Práctica 6 - Ejercicio 2 - Adrian Garcia
#Datos Crear 2 llistes, primer saber les repetides entre les 2 llistes, despres les que apereixen a la primera pero no a la segona i viceversa.
#com anava molt just de temps, he preferit inentar-ho d'alguna manera encara que no sigui optima.
llista=[]
llista2=[]
llista3=[]
llista4=[]
llista5=[]
llista6=[]
a=int(input("Cuantas palabras tiene la lista: "))
for i in range(0,a):
    c=str(input("Escriu una paraula: "))
    llista.append(c)
print("La primera lista es: ",llista)
a=int(input("Cuantas palabras tiene la segunda lista: "))
for i in range(0,a):
    c=str(input("Escriu una paraula:"))
    llista2.append(c)
print( "La segunda lista es: ",llista2)
for e in llista:
    if e in llista2:
        llista3.append(e)
    else:
        llista4.append(e)
for e in llista2:
    if e not in llista:
        llista5.append(e)
print ("Palabras que aparecen en las 2 listas:",llista3,"\n" + "Palabras que solo aparecen la primera:",llista4
,"\n"+ "palabras que solo esten en la segunda:",llista5,"\n"+ "Todas las palabras:",llista3 + llista4+ llista5)