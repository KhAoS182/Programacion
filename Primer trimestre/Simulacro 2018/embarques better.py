#simulacro examen 26/11 - Adrian Garcia
#Datos
vehiculos=0
coches=[]
pesototal=0
accion = 0
trayectos=['Mallorca-Menorca','Mallorca-Ibiza','Mallorca-Formentera','Mallorca-Valencia']
trayectoskm=[200,300,400,500]
origen=[]
destino=[]
km=[]
def menu():
    print("----------------------")
    print("-    M   E   N   U   -")
    print("------------------------")
    print("  1) embarcar vehiculo")
    print("  2) introducir trayecto")
    print("  3) calcular gasto combustible")
    print("  4) imprimir lista vehiculos")
    print("  5) salir")
    print("----------------------")
def embarcar_vehiculos():
    datos=""
    pesocoche=0
    seguir="S"
    global vehiculos
    global coches
    global pesototal
    global km
    while seguir =="s" or seguir == "S":
        datos=input("Introduce marca del vehiculo: ")
        coches.append(datos)
        datos=input("Introduce modelo del vehiculo: ")
        coches.append(datos)
        datos=input("Introduce matricula del vehiculo: ")
        coches.append(datos)
        datos=int(input("Introduce el peso del vehiculo: "))
        coches.append(int(datos))
        pesototal=pesototal+datos
        vehiculos=vehiculos+1
        seguir=input("Quieres introducir un vehiculo mas? (S|N)")

def consultar_trayecto():
    global trayectos

def introducir_trayecto():
    global trayectos
    global origen
    global destino
    global km
    donde=str
    dest=str
    kmdest=0
    donde=input("Dame el origen del trayecto:")
    origen.append(donde)
    dest=input("Dame el origen del trayecto:")
    dest.append(dest)
    kmdest=input("Dame los KM del trayecto")
    km.append(kmdest)
    
def calcular_gasto_combustible():
    global vehiculos
    global pesototal
    print(pesototal)
def imprimirvehiculos():
    num=0
    global coches
    global vehiculos
    print("=============================================")
    print("Listado de vehiculos introducidos hasta el momento")
    print("=============================================")
    for i in range (0,vehiculos):              
        print("Vehiculo Nº%i)"%(i),"Marca: ",coches[num],"Modelo: ",coches[num+1],"Matricula: ",coches[num+2],"Peso:",coches[num+3],"KG")
        num=num+4
while accion !=5:
    menu()
    accion = int(input("¿que opcione deseas? "))
    if accion==1:
        if vehiculos >=20:
            print("Esta lleno")
        else:
            embarcar_vehiculos()
    elif accion==2:
        introducir_trayecto()
    elif accion==3:
        calcular_gasto_combustible()
        
    elif accion==4:
        imprimirvehiculos()

