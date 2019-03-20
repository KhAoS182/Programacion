##PRUEBA SIMULACRO DAW - RAFAEL GIÓN EVALUACIÓN DEL EXAMEN:
##-->MENÚ 1 TOT: 0,6 SI FUNCIONA + 0,2 SI ESTÁ HECHO CON WHILE +
##0,2 USO DE CONSTANTE
##-->EMBARCAR VEHÍCULO 1,5 TOT: 0,7 SI FUNCIONA + 0,3 CON WHILE + 0,2
##CALIDAD + 0,2 MENSAJE MAX
##-->INTRODUCIR TRAYECTO 1 TOT: 0,5 SI FUNCIONA +
##0,2 CALIDAD + 0,3 FUNCIÓN CORRECTA
##-->CONSULTAR TRAYECTO 3 TOT: 1,3 SI FUNCIONA + 0,5 CONSULTA CORRECTA+
##+ 0,5 WHILE CORRECTO + 0.5 RETURN CORRECTO + 0,2 CALIDAD
##-->CALCULAR GASTO DE COMBUSTIBLE 2 TOT: 0,8 SI FUNCIONA +
##0.5 FOR I IN + 0,5 TRATAMIENTO CORRECTO LLAMADA A LA FUNCIÓN + 0,2 CALIDAD
##-->IMPRIMIR LISTA VEHICULOS 1,5 TOT: 0,7 SI FUNCIONA + 0,3 FOR I IN +
## 0,3 OPERADOR CORTE CADENA + 0,2 CALIDAD 
 

def embarcar_vehiculo():
    seguir="S"
    while seguir=="S" and len(lista_vehiculos)<MAX_VEHICULOS:
        vehiculo=[]
        vehiculo.append(input("introduce la marca del vehiculo: "))
        vehiculo.append(input("introduce el modelo del vehiculo: "))
        vehiculo.append(input("introduce el matrícula del vehiculo: "))
        vehiculo.append(int(input("introduce el peso del vehiculo: ")))
        lista_vehiculos.append(vehiculo)
        seguir=input("¿Quieres introducir un vehículo más?(S|N) ")
    if (MAX_VEHICULOS == len(lista_vehiculos)):
        print("El barco está lleno, no pueden embarcar más vehículos.")
        
def introducir_trayecto(lista_trayecto):
    trayecto=[]
    trayecto.append(input("Dame el origen del trayecto: "))
    trayecto.append(input("Dame el destino del trayecto: "))
    trayecto.append(int(input("Dame los km del trayecto: ")))
    lista_trayecto.append(trayecto)
    
def consultar_trayecto(lista_trayecto):
    origen=input("Dame el origen del trayecto: ")
    destino=input("Dame el destino del trayecto: ")
    i=0
    encontrado=False
    while(encontrado==False and i<len(lista_trayecto)):
        if ((lista_trayecto[i][0]==origen and
           lista_trayecto[i][1]==destino) or
           (lista_trayecto[i][0]==destino and
           lista_trayecto[i][1]==origen)):
            encontrado=True
        else:
             i+=1

    if encontrado:
        return lista_trayecto[i]
    else:
        return ["Vacío","Vacío",0]
        
def calcular_gasto_combustible(lista_vehiculos):

    trayecto=consultar_trayecto(lista_trayecto)
    km=trayecto[2]
    if km == 0:
        print ("El trayecto que ha introducido no ha sido encontrado")
    else:
        peso_total=0
        for i in lista_vehiculos:
            peso_total+=i[3]
        
        precio_combustible=float(input("Dame el precio del combustible: "))
        print ("El precio del combustible es",
        (precio_combustible*peso_total*km))

def imprimir_lista_vehiculos(lista_vehiculos):
    print ("===================================================")
    print ("LISTADO DE VEHÍCULOS INTRODUCIDOS HASTA EL MOMENTO ")
    print ("===================================================")
    j=0;
    for i in lista_vehiculos:
        
        j+=1
        print ("Vehículo nº%d) --> Marca: %s  Modelo: %s Matrícula:\
****%s"%(j,i[0],i[1],i[2][(len(i[2])-3):]))

# =================== PROGRAMA PRINCIPAL ============================
#LISTAS
lista_vehiculos=[]
lista_trayecto=[]
# CONSTANTES
MAX_VEHICULOS=20

#VARIABLES
salir=False

while salir==False:
    print ("=========================")
    print ("=   M   E   N   Ú       =")
    print ("=========================")
    print (" 1) embarcar vehículo ")
    print (" 2) introducir trayecto ")
    print (" 3) calcular gasto combustible")
    print (" 4) imprimir lista vehículos")
    print (" 5) salir")               
    print ("=========================")           
    opcion=int(input("¿Qué opción deseas? "))

    if opcion==1:
        embarcar_vehiculo()
    elif opcion==2:
        introducir_trayecto(lista_trayecto)
    elif opcion==3:
        calcular_gasto_combustible(lista_vehiculos)
    elif opcion==4:
        imprimir_lista_vehiculos(lista_vehiculos)               
    elif opcion==5:
        salir=True
    else:
        print ("LA OPCION INTRODUCIDA ES INCORRECTA, VUELVA A INTENTARLO ")
    
               