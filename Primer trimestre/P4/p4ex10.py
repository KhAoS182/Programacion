#Práctica 4 - Ejercicio 10 - Adrian Garcia
#Datos dibuixar un triangle omple
b= int(input('Alçada del triangle: '))
for i in range (0,b):
    print (" "*((b-1)-i),"*"*(i*2+(1)))