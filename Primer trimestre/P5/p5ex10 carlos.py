a=input("Escribe un nombre: ")
lista=[]
while (a != ""):
    listatemp=[]
    listatemp.append(a)
    b=float(input("Escribe una nota: "))
    while (b >= 0 and b <= 10):
        listatemp.append(b)
        b=float(input("Escribe otra nota: "))
    lista.append(listatemp)    
    a=input("Escribe un nombre: ")    
print("Las notas de los alumnos son: ")
for i in range(len(lista)):
    for j in range(len(lista[i])):
        if j == 0:
            print (lista[i][j], end=":")
        elif j == (len(lista[i])-1):
            print (lista[i][j])
        else:
            print (lista[i][j], end=" - ")