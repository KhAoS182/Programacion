#Práctica 5 - Ejercicio 6 - Adrian Garcia
#Datos Escriure valors entre un minim i un maxim.
llista=[]
a=int(input("Introdueix un nombre: "))
b=int(input("Introdueix un nombre major: "))
while a>b:
    b=int(input("%d no es major que %d. Torna-ho a probar: "%(b,a)))
c=a+1
d=0
while (c>a or c<b or d>1):  
    c=int(input("Introduexi un nombre entre %d i %d: "%(a,b)))   
    while c<a or c>b:
        c=int(input("%d no es un nombre valid, Torna-ho a prova: "%(c,))) 
    llista.append(int(c))
    d=d+1     
print("Els nombres que has escrit son:",llista)   