#Práctica 4 - Ejercicio 9 - Adrian Garcia
#Datos
a= int(input('Amplada del rectangle: '))
b= int(input('Alçada del rectangle: '))
print ("*"*a)
for x in range (1,b-1):
    if (a<=3 ):
        print ("*",""*(a-5),"*")
    else:
        print("*"," "*(a-4),"*")
print ("*"*a)