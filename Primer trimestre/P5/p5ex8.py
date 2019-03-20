#Práctica 5 - Ejercicio 8 - Adrian Garcia
#Datos Escriure un nombre limit i quan els nombres introduïts sumin mes que el nombre no podra abacar
#fins acabar exacte.
llista=[]
a=int(input("Introdueix un nombre limit: "))
b=0
c=0
while (b<a):   
    c=int(input("Escriu un valor:"))
    llista.append(int(c))
    b=b+c
    if b>a:
        llista.remove(c)
        b=b-c
        print("El valor es massa gran.", end=" ")
print("El limit a superar es %d. La llista creada es"%(a),llista)