def validar_cliente(cliente):
    nif=raw_input("Por favor, introduzca su nif: ")
    for i in range (len(cliente)):
        if nif == cliente[i][2]:
            pin=input("Por favor, introduzca su PIN: ")            
            if pin == cliente[i][3]:
                return i
    return -1

def imprimir_menu():
    print "================================"
    print "= Cajero Autom�tico IES FBMOLL ="
    print "================================"    
    print "= 1) Consultar saldo           ="
    print "= 2) Retirar efectivo          ="
    print "= 3) Ingresar efectivo         ="
    print "= 4) Salir                     ="
    print "================================"    
    
def consultar_saldo(cliente):
    valido=validar_cliente(cliente)
    if valido <> -1:
        print
        print "========================================"
        print " Cliente: ", cliente[valido][0], cliente[valido][1]
        print " NIF: ", cliente[valido][2][:2]+"***"+cliente[valido][2][4:]
        print " Su saldo actual es: ", cliente[valido][-1], "�"
        print "========================================"
        print
    else:
        print "El usuario o la contrase�a son incorrectos"
                
def retirar_efectivo(cliente):
    valido=validar_cliente(cliente)
    if valido <> -1:
        importe= input("�cuanto importe desea retirar? ")
        if cliente[valido][-1]> importe:
            cliente[valido][-1]=cliente[valido][-1]-importe
            print
            print "========================================"
            print " Cliente: ", cliente[valido][0], cliente[valido][1]            
            print " Su saldo actual es: ", cliente[valido][-1], "�"
            print " Efectivo retirado: ", importe, "�"
            print "========================================"            
        else:
            print 
            print "========================================"
            print " Cliente: ", cliente[valido][0],cliente[valido][1]
            print " Su saldo actual es ", cliente[valido][4]
            print " No tiene suficiente saldo en la cuenta."
            print "========================================"            
    else:
        print "El usuario o la contrase�a son incorrectos."
    return cliente

def ingresar_efectivo(cliente):
    valido=validar_cliente(cliente)
    if valido <> -1:
        importe= input("�cuanto importe desea ingresar? ")
        cliente[valido][-1]=cliente[valido][-1]+importe
        print " "
        print "========================================"
        print " Cliente: ", cliente[valido][0], cliente[valido][1]
        print " Su saldo antes del ingreso era: ", cliente[valido][-1]-importe
        print " Su saldo actual es ", cliente[valido][4]
        print " Importe ingresado ", importe
        print "========================================"
    else:
        print "El usuario o la contrase�a son incorrectos"        
    return cliente

clientes=[["Rafa","Nadal","33800785m",1111,30500.0],
          ["Pepe","Garcia","22800785m",2222,500.0]]
opcion=0
while opcion <>4:
    print clientes    
    imprimir_menu()
    opcion=input("Selecciona la opci�n que desea: ")
    if opcion == 1:
       consultar_saldo(clientes)
    elif opcion == 2:
       clientes=retirar_efectivo(clientes)
    elif opcion == 3:
       clientes=ingresar_efectivo(clientes)   