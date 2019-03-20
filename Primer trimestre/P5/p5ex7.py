#Práctica 5 - Ejercicio 7 - Adrian Garcia
#Datos Escriure un nombre limit i quan els nombres introduïts sumin mes que el nombre a superar acabar.
llista=[]
a=int(input("Introdueix un nombre limit: "))
b=0
c=int(input("Escriu un valor:"))
b=b+c
while (b<a):   
    c=int(input("Escriu un altre valor:"))
    llista.append(int(c))
    b=b+c
print("El limit a superar es %d. La llista creada es"%(a),llista)