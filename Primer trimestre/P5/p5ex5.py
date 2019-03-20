#Práctica 5 - Ejercicio 5 - Adrian Garcia
#Datos Escriure sempre un valor major al anterior sino acabar.
llista=[]
a=0
b=int(input("Introdueix un nombre: "))
while (b>a):  
    a=b  
    llista.append(int(b))
    b=int(input("introduce numero mayor que %d: "%(a)))        
print("Els nombres que has escrit son:",llista)    