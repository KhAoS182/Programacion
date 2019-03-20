#Práctica 5 - Ejercicio 11 - Adrian Garcia
#Datos Amb 2 valors un maxim i un minim ens dongui un nombre aleatori i l'haguem d'encertar.
import random
import time
d=0
e=0
random.seed(time.time())
a=int(input("Escriu un valor minim: "))
b=int(input("Escriu un valor maxim: "))
c = random.randint(a,b) 
print("A veure si endeveine un nombre sencer entre %d i %d"%(a,b))
while d!=c:
    e=e+1
    d=int(input("Escriu un nombre: "))
    if d>c:
        print("Massa gran!",end=" ")
    elif d<c:
        print("Massa petit!",end=" ")
    else:
        print("Correcte! Ho has intentat %d vegades"%(e))   