import random
import math
import msvcrt as m
def wait():
    m.getch()
#Los objetos y stats del personaje, ya que pueden variar segun nivel y experiencia.
jugadorhp = 1000.0
recuperacion = 5
defensa = 5
nivel=0
experiencia = 80
barraxp=experiencia/10
cueva=0
objetos=["Pociones",1,"Vendas",5]
#Como se dibujaran las cuevas
def printcueva1():  #Nomes utilitzarem un def per pintar ses coves
    print("---------")#Pero primer les separam per poderles dibuixar millor
def printcueva2():    #Emplearem una variable que dins la propi funcion generi una random.
    a=input("---------")
def printcueva3():
    a=input("---------")
def printcueva4():
    a=input("---------")    
def printcueva5():
    a=input("---------")
def situaciones():#need ideas
    x=0
def stats(a,b,c):
    exp=math.floor(c)    
    print("Vida: %.1f \nNivel: %i"%(a,b))
    for i in range (0,exp):
        print(end="=")
    for i in range(exp,10):
        print(end="_")
    print("")
print("Comandos, IZQUIERDA('i'), DERECHA('d'), SEGUIR('s'), OBJETOS('o') y STATS('stats')")
while jugadorhp>0.01:
    print(stats(jugadorhp,nivel,barraxp))
    a=input("Que quieres hacer, seguir o usar algun objecto?\n")
    cueva=random.randint(0,100)
    if cueva >=0 and cueva <=30:
        printcueva1()
    elif cueva >=30 and cueva <=60:
        printcueva2()
    elif cueva >=60 and cueva <=90:
        printcueva3()
    else:
        printcueva4()