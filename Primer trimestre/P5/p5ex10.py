#Práctica 5 - Ejercicio 10 - Adrian Garcia
#Datos Guardar el nom de l'alumne i les seves notes.
llista=[]
llista2=[]
llista3=[]
c=0
a=str(input("Done'm un nom: "))
while a!="":  
    llista.append(str(a))
    b=float(input("Escriu una nota: "))
    while b<=10 and b>=0:
        c=c+1
        llista2.append(float(b))
        b=float(input("Done'm una altre nota: "))     
    llista3.append(int(c)) 
    a=str(input("Done'm un nom: "))
    c=0 
f=0
e=0
g=0
print("Els noms i les notes son: ")
for i in llista:   
    e=e + llista3[f]
    f=f+1
    print(i,llista2[g:(e)])
    g=e