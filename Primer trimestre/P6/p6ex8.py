#Práctica 6 - Ejercicio 8 - Adrian Garcia
#Datos Crear 1 llista i ordenarla sense sort.
llista=[]
llista2=[]
a=int(input("Cuantas palabras tiene la lista: "))
for i in range(0,a):
    c=str(input("Escriu una paraula:"))
    llista.append(c)
print ("La llista creada es:",llista)
llista2=llista
for i in llista:
    for i in range(1, len(llista2)):
        for j in range(len(llista2)-i):
            if (llista2[j] > llista2[j+1]):
                temp = llista2[j]
                llista2[j] = llista2[j+1]
                llista2[j+1] = temp
print (llista2)