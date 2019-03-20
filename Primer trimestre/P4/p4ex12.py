#Práctica 4 - Ejercicio 12 - Adrian Garcia
#Datos Aquest esta fet amb break, perque amb nombre alts que no son prims tarda molt.
a= int(input('Dame un numero: '))
b=0
c=[]
for i in range (2,a):
    if (a%i==0):
        b=b+1
        c.append(i)
if (b<1):
        print ("El numero %s es primo"%(a))
else:
        print ("El numero %s no es primo, se puede dividir por %s"%(a,c))
