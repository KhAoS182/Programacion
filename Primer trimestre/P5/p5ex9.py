#Práctica 5 - Ejercicio 9 - Adrian Garcia
#Datos Fer una especia de agenda.
llista=[]
d=0
a=input("Done'm un nom: ")
while a!="":
    llista.append(a)
    a=input("Done'm un telefon: ")
    llista.append(int(a))
    a=input("Done'm un nom: ")
print("Els noms i telefons son:")
for i in llista:  
    if d%2==0:
        print(i+": ",end="")
    else:
        print(i)
    d=d+1    