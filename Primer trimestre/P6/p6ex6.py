#Práctica 6 - Ejercicio 6 - Adrian Garcia
#Datos Crear 1 llista i escriurer-la inversa.
llista=[]
a=int(input("Cuantas palabras tiene la lista: "))
for i in range(0,a):
    c=str(input("Escriu una paraula:"))
    llista.append(c)
print ("La llista creada es: ",llista,"\n" + "La llista inversa es: ",end="")
llista.reverse()
print(llista)