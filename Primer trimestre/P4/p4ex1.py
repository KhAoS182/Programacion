#Práctica 4 - Ejercicio 1 - Adrian Garcia
#Datos
a=0
print ("Primera secuencia:")
for a in range (10):
    a= a+1
    print (a,"",end="")
print ("")
print ("Segunda secuencia:")
#Segunda secuencia
for a in range (1,11):
    a= a*2
    print (a,"",end="")
print ("")
print ("Tercera secuencia:")
for a in range (20):
    a= a*2
    if (a>18):
        print (a,"",end="")
print ("")
print ("Cuarta secuencia:")
for a in range (33):
    if (a%4==0 and a>8):
        print (a-2,"",end="")
print ("")
print ("Quinta secuencia:")
b=40
for a in range (9):
    a=a*5                      
    print (b-a,"",end="")