#Práctica 4 - Ejercicio 3 - Adrian Garcia
#Datos suma de sencers desde el primer nombre fins al segon
a = int(input("Ingresar un numero: "))
b = int(input("Ingresar un numero mayor: "))
c=a
if (a>b or a==b):
    print ("Error")
else:
    print (a,end="")
    for x in range (a,b):
        a=a+1                         
        print (' + ',a ,end="")
        c=c+a                    
if (a==b):
    print (" =",c )
    print("La suma des de" ,a, "fins a" ,b, "es:" ,c,)

