#Práctica 5 - Ejercicio 3 - Adrian Garcia
#Datos Hem de poder escriure notes i que al final les guardi i les escrigui.
llista=[] 
a=float(input("Introdueix una nota (del 0 al 10): "))
while (a<11 and a>0): 
    llista.append(float(a))
    a=float(input("Introdueix una nota: "))    
print ("Les notes que has escrito son:",llista)