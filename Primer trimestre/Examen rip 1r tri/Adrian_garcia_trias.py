peliculasclub=[]
catalogo=0
almacen=0
def añadir_peliculas():
    global almacen
    global catalogo
    peliculas=[]
    peliculas.append(input("introduce la id de la pelicula: "))
    peliculas.append(input("introduce el titulo de la pelicula: "))
    peliculas.append(input("introduce el director de la pelicula: "))
    peliculas.append(input("introduce la duracion de la pelicula: "))
    peliculas.append(input("introduce el genero de la pelicula: "))
    peliculas.append(input("introduce año de la pelicula: "))
    peliculas.append("Disponible")
    peliculas.append(int(input("Cantidad de copias a introducir: ")))
    almacen=almacen+peliculas[7]
    peliculas.append(0)
    peliculasclub.append(peliculas)
    listar_peliculas()
    catalogo=catalogo+1
def menu():
    print("------------------------")
    print("=    M   E   N   U     =")
    print("------------------------")
    print(" 1) añadir pelicula")
    print(" 2) reservar pelicula")
    print(" 3) buscar peliculas")
    print(" 4) salir")
    print("----------------------")
def reservar_pelicula():
    listar_peliculas2()
    reserva=input("Que pelicula deseas reservar: ")
    for i in range(0,catalogo):
        if reserva==peliculasclub[i][1]:
            if peliculasclub[i][6]=="Disponible":
                peliculasclub[i][7]=peliculasclub[i][7]-1
                peliculasclub[i][8]=peliculasclub[i][8]+1
                print("-----------------------")
                print("Se ha hecho una reserva")
                print("-----------------------")
                print()
                if peliculasclub[i][7]==0:
                    peliculasclub[i][6]="No disponible"
            else:
                print("no esta o no existe o no esta disponible")

def listar_peliculas():
    global peliculasclub
    peli=0
    for i in peliculasclub: 
        print(peliculasclub[peli])
        peli=peli+1
def buscar_pelicula():
    pos=0
    peli=input("Que quieres buscar, titulo, director, genero, duracion o año:")
    if peli =="Titutlo" or "titulo":
        for i in peliculasclub:
            if peliculasclub[pos][1]== peli:
                print(peliculasclub[i][0:8])
def listar_peliculas2():
    peli=0
    for i in peliculasclub: 
        print("Nombre:",end=" ")
        print(peliculasclub[peli][1],end="  Director: ")
        print(peliculasclub[peli][2],end="  ")
        print(peliculasclub[peli][6],end="  Copias:")
        print(peliculasclub[peli][7])
        print("           -----------------------")
        peli=peli+1
opcion=True
while opcion==True:
    menu()
    accion = int(input("¿que opcione deseas? "))
    if accion==1:
        añadir_peliculas()
    elif accion==2:
        reservar_pelicula()
    elif accion==3:
        buscar_pelicula()
    elif accion==4:
        opcion=False
    else:
        print("Incorrecto")