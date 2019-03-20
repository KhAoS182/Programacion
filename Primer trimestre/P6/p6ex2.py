#Práctica 6 - Ejercicio 2 - Adrian Garcia
#Datos Crear 2 llistes i saber si hi ha paraules repetides.
llista=[]
a=int(input("Cuantas palabras tiene la lista: "))
for i in range(0,a):
    b=str(input("Escriu una paraula:"))
    llista.append(b)
print(llista)
c=input("Dime la palabra: ")
d=llista.count(c)
print("La palabra %s ha salido %d veces"%(c,d))