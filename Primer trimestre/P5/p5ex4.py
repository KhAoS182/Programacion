#Práctica 5 - Ejercicio 4 - Adrian Garcia
#Datos Guarda el primer valor i obliga a posar-ne un major.
a=int(input("Escriu un nombre: "))
b=int(input("Escriu un nombre major que %d: "%(a)))
while (a>b): 
    print ("El nombre",b,"no es major que",a,end=". ")
    b=int(input("Escriu un nombre major que %d: "%(a)))
print ("Els nombres que has escrit son %d i %d"%(a,b))     