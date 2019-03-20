#Práctica 4 - Ejercicio 9 - Adrian Garcia
#Datos crear un rectangle buit nomes amb els costats
a= int(input('Amplada del rectangle: '))
b= int(input('Alçada del rectangle: '))
print ("*"*a)
for x in range (1,b-1):#Les condicions de els recntagles 2X i 3X son condicions apart perque quedin a la mateixa posicio
    if (a==3):
        print ("* *")
    elif(a==2):
        print ("**")          
    else:
        print("*"," "*(a-4),"*")
print ("*"*a)