#Proyecto del primer trimestre
#Adrián García Trías y Andrés Seguí Sastre
#Recomendamos utilizar la shell en pantalla completa, ya que algunos dibujos pueden no tener sentido.
#Habrá cosas como la lista de jugador que es donde deberíamos haber guardado todo lo relacionado con el
#jugador, pero hemos tenido mucho problemas cuando dividíamos algunas funciones en otros archivos.py, lo aclaramos porque lo hubiéramos hecho con una lista.
import random
import msvcrt as m
import winsound
import os
import math  #Hemos utilizado esto para convertir float a integers.
jugador=[1000,0,0.0,5,5,0] #Vida del jugador, nivel, experiencia, defensa, recuperación y turnos.No lo hemos implementado, pero era nuestra idea.
opciones=["i","I","a","A","s","S","d","D","stats","st"]
opcionesd=['a'] #Opciones disponibles.
inventario=["Pociones",1,"Vendas",5]
experiencia = 0.0
lvl=0
nivel = 0
save=bool
barra="="
jugadorhp=1000.0
recuperacion=5
defensa=5
cueva=0
barraxp=0
turnos=0
estado=0
accion="a"

def clear(): #Limpia la pantalla de la consola para Ubuntu o Windows.
    if os.name == "posix":
        os.system ("clear")
    else:
        os.system ("cls")

def printcueva(): #3 opciones.
    global opcionesd
    opcionesc=[]
    cueva=random.randint(0,100)
    if cueva >=0 and cueva <=30:
        opcionesc=["i","I","a","A","s","S","d","D","stats","st","salir","Salir","O","o"]       
        cueva=random.randint(0,3)
        if cueva==0:
            print('''                                                                                    
                 M.        +mo`                   
                 yy         `d/                   
                 /M          y/                   
                 `M          M.                   
                  M          M`                   
                 sm          d/....      ..:/oooo/
                +m.          sds//shsoysyo//..  ..
                y/                                
                y/                                
                /m                              ./
                 d/          .:+oyosyo//////oyyyo:
                 sy         sd/.`    ........     
    `:/ooooosysoy+.         ys                    
oshyy+-`                    .N-                   
.                            y/                   
                            .M.                   
               .:+/         /y                    
    `/ooooooohys/oy         /y                    
yysyy+.          /h         :M.                   
.                .my`        om-                  
                   sm`        /N                  
                    om         M                  
                     M         m/                 
                    .M         :N`                
                    +h          d/
                                       ''')
        elif cueva==1:
                print('''
                    m/        y/                  
                    -M        oy                  
                     M        +y                  
                    om        N:                  
                   :N.        M                   
                   y+         M                   
                   ys         M                   
                   .M         M                   
          .....`  `yy         M                   
.+yoooooyyo///+yooss`         M.                  
y/                            /ydy:`              
                                 .omo`            
                                    /mo.          
           `/syooos+         ///.    `/oyoyosyoo+:
////ohyyoooo+.    /y        `m//my.             -+
.....             +y        oh   /dh`             
                 .N-        y/     sm.            
                 yy        -m-      /yds-         
                yd`       `m/          -syyys:... 
              .dy`        od                .///sh
             `ms         /N.                      
             dy         /N.                       
             M          N-                        
            `M          M                         
            /d          m/                        
                    ''')
        elif cueva==2:
                print('''
                       M+          M-                        
                      hN          No                    .---
                      -M          sd               `/shdso++
                      /M          +M      `:+++++smms:      
                     `Ms         `ms    /hNy:-----          
                     +m`         hMyssddy/                  
                     /N-         :+-                        
                      ds                              -/ohdd
                      ss                     `/shddssss+:.  
                      ds                   -hmy:`           
                      M:          `/sshhsshh+`              
                     -M-          Nm:`                      
                     +d           ss                        
                     +d           ss                        
             .odyssssyy          `M/                        
    -+osssssmdo.                 +m`                        
+sddy+-.                         /N.                        
+-`                              /N.                        
                                 +d                         
                  -odmM-         do                         
          .----+ymy+. M+         dy                         
      -+ymdo+++:-`    hs         /N.                        
++sdyyd+-             M/          M-                        
+-.                  -M-          M-                        
                     +d          /N.                        
                     +d          od                         
                     od         .No                         
                    .No         -M                          
                        ''')
        else:
                print('''                                                                                                                                                                
                         -/`     `o                                                                                                                                                                     
                        .+       o`                                                                                                                                                                     
                        ./      +.                                                                                                                                                                      
                        .+      o`                                                                                                                                                                      
                         o.     ./-                                                                                                                                                                     
                         `o      `:/`                                                                                                                                                                   
                          s       `/-                                                                                                                                                                   
                          o       o-                                                                                                                                                                    
                          o       s                                                                                                                                                                     
                          o       o                                                                                                                                                                     
 -...``                    s       s                                                                                                                                                                     
 ``..-----------::::-     o      +-                                                                                                                                                                     
                    .+-   o     +-         ``                                                                                                                                                           
::-`                  /: .o     o    `:::::--:::::.                                                                                                                                                     
  `-:::::::::.         o-o`     y/:::-            -//                                                                                                                                                   
            `-+`        :`      -                   ./::.                                                                                                                                               
              `o.            .--.    .:/:+-`            -:::::---:`                                                                                                                                     
               `.::://`     -/ `.::::.    .-:/:-                                                                                                                                                        
                     `o     +`                `./::---:-`                                                                                                                                               
                      ::    o                       ````-::::::.                                                                                                                                        
                      `+    o                                                                                                                                                                           
                       -    . 
                        ''')
    elif cueva >=31 and cueva <=60: #2 opciones.
        cueva=random.randint(0,2)        
        if cueva==0:
            print('''
M.         M.                                 
 m+         od.                                
   /m.         +m-                               
      od.        :m/                              
        +m`       .N+                             
         +m.       .m/                            
          :m/       .m/                           
           .dy`      .N/                       :+d
             /mo`     -myo/`               ./yhs- 
              `ym`       .sm/.         .:ydy/`    
                om`        `/yyysooohyy+/.        
                ys                               
                /h                           ./ym
                .m/        ......///oooyyyo/. 
                 y/       :hd+///ooo//...         
                 m:       M.                      
                 od       .N                       
                 M.       /y                       
                 M        /y                       
                 M        /d                       
                 M         m/                      
                 N.        .ms                     
                 y/         `yy                    
                 yo          `M                    
                 -N          -m                    
                    ''')
            opcionesc=["i","I","d","D","stats","st","salir","Salir","O","o"]
        elif cueva==1:
            print('''                                      
.       .hh/`                                   ./
mo.       .om/                               `/my/
 /hy/`      .my.                     ./+oooyyyo`  
   .ods`      /ym/                `/dy:.          
      sm:       .hh`            `/mo`            `
       .ms`       sm:     `:+oyyh+.             +m
        `omo       .my. `ym+-                ./my`
          `sm/       -myms`             .ohyso/.  
            .smo`      ..            -ohy/`       
               +m-            -/oyoshs:`          
                /m         .yds:`                 
                /m         yo                     
                y+         y/                     
                m:         y/                     
                M          y/                     
                M          y/                     
                M          y/                     
                d/         y/                     
                y/         m/                     
                y/         M                      
                y/        :m                      
                m/        /y                      
               yd         /y                      
              om          /y                      
                ''')
            opcionesc=["i","I","d","D","stats","st","salir","Salir","O","o"]
        else:
            print('''
       /my:/my
 M /my:       :/my:.syysooyys:.         
M                          ./yhs:`     
.M                             -/shys/`
/y                                  ./o
/y         .o/+ooo//.              
ss         ys..` ../+yyy+:         
h/         y/           -sdy/`     
M`         om`             ./yyyo/`
M           +m/`                ./.
M            .+mo`                 
N.            `sm:                
y/             .my/`             
y/               .+yyy/-         
y/                   .:+yysys+:` 
`N.                          `.+dh
 yy         +hy/.                 .
/N`         m/./yhs/.              
-m`         /m     ./oyosh+-        
/y         /N-            :oyy+:.   
/y         y/                 -/ssoy
/y         /m:                      
           ''')
            opcionesc=["a","A","d","D","stats","st","salir","Salir","O","o"]     
    elif cueva>=61 and cueva<=90:
        cueva=random.randint(0,2) 
        if cueva==0:
            print('''                                               
                     -/:`                         
                    dh:+yhy+.                     
                   :N     `:my               .///o
                   :N       `yy           /yhs:..`
                   m/        `N.    `:+yyys.      
                   M`         oy/oyyy/-           
                   h/         .y/.             `-+
                   +y                       `/dh+-
/-.                /y                :syoooyy/`   
-/yh/              +y            .+hh+-           
   .yd+.          .M-         /hds:`              
     `:yds-      .m/         /d.                  
         .smy:   .M          /y                   
y/`         -sds. d+         /y                   
.+hh/`         /my/y         /y                   
   .+dy/`        od/         /y                   
      .om+                   /y                   
        `sdy/`               /y                   
           .ody/-            -N`                  
              .:+ydo-         sd:                 
                   .M          /y                 
                   :N          +y                 
                   y+          y/
                    ''')    
            opcionesc=["i","I","d","D","stats","st","salir","Salir","O","o"]                                           
        elif cueva ==1:
            print('''
                               :M.       :N        
                               m/        M        
                              yd        .M        
                             od`        yy        
                            yd.         M.        
                          .ds          od         
                         .m/          -N.         
                        .m:           /y          
                       .m-            hs          
                      /m.           `dy`          
                    `yd.           :m+            
                  .sm+          `/my.             
               `+dy:          .sdo`               
              /mo`          .yh/                  
            .hy.          .om/                    
           om/         `/hy/`                     
         :my`         /mo`                        
        sm-          yd.                          
       yd`         .my`                           
      yy          -m/                             
     yy`         /m-                              
   `dy         `ym.                               
  .m+         .dy`                                
 -N/         .m+                                  
+N-         .m/                                   
                   ''')
            opcionesc=["a","A","stats","st","salir","Salir","O","o"]
        else:
            print('''
           hy      /mo                             
          .m/      .m+                            
           -mo      .m/                        `/o
            `ds      .N/                     .ydo.
             .N.      :No                  /hd/   
              ys       .dh.             `+dy.     
              :m         +m/         .+hho.      -
               hd.        /M.     `ohy/`        om
                /m/        sm.   `hy`         :dy.
                 .m+        +N- .my`        /my.  
                  .N.        /mom/       :yds.    
                   oh         o+`      ody-       
                   .M                -mo`         
                   `M               /m/           
                   .M            -/my.            
                   /M       +syhyo:.              
               -+yyh/       /y                    
          .yhsyo:`          /y                    
    `://sdy/                /y                    
.yyyy+-..                   /y                    
N/              `ohyd       y+                    
h             `omo`.M       d/                    
y       .://+ydo`   M-     `M`                    
y ./oyyys/-..`      M/     /d                     
mho/.              :m`     /d                     
                    ''')
            opcionesc=["a","A","d","D","stats","st","salir","Salir","O","o"]
    else:
            print('''
                               :M.       :N        
                               m/        M        
                              yd        .M        
                             od`        yy        
                            yd.         M.        
                          .ds          od         
                         .m/          -N.         
                        .m:           /y          
                       .m-            hs          
                      /m.           `dy`          
                    `yd.           :m+            
                  .sm+          `/my.             
               `+dy:          .sdo`               
              /mo`          .yh/                  
            .hy.          .om/                    
           om/         `/hy/`                     
         :my`         /mo`                        
        sm-          yd.                          
       yd`         .my`                           
      yy          -m/                             
     yy`         /m-                              
   `dy         `ym.                               
  .m+         .dy`                                
 -N/         .m+                                  
+N-         .m/                                   
   
            ''')
            opcionesc=["a","A","s","S","stats","st","salir","Salir","O","o"]
    opcionesd=opcionesc

def situaciones():
    global jugadorhp
    global nivel
    global experiencia
    global situacion
    global recuperacion
    global estado
    global turnos
    situacion=0
    situacion=random.randint(0,300)
    if situacion>=0 and situacion <=10:
        print("¡Te has tropezado con una puerta!\nHas perdido 20 de vida.")
        jugadorhp=jugadorhp-20
        winsound.PlaySound('sonidos/smb3_sound_effects_thwomp.wav', winsound.SND_FILENAME)
    elif situacion>=10 and situacion <=20:
        print("¡Te has tropezado con una piedra!\nHas perdido 50 de vida.")
        jugadorhp=jugadorhp-50
        winsound.PlaySound('sonidos/smb3_sound_effects_thwomp.wav', winsound.SND_FILENAME)
    elif situacion>=20 and situacion <=30:
        print("¡Te has chocado una cuerda!\nHas perdido 10 de vida.")
        jugadorhp=jugadorhp-10
        winsound.PlaySound('sonidos/smb3_sound_effects_thwomp.wav', winsound.SND_FILENAME)
    elif situacion>=30 and situacion <=40:
        print("¡Te ha atacado una serpiente!\nHas perdido 50 de vida y estas envenenado, perderás 10 de vida por zona")
        jugadorhp=jugadorhp-50
        recuperacion=recuperacion-10
        winsound.PlaySound('sonidos/smb3_sound_effects_thwomp.wav', winsound.SND_FILENAME)
    elif situacion>=40 and situacion <=50:
        print("¡Te ha atacado un murciélago!\nHas perdido 20 de vida.")
        jugadorhp=jugadorhp-25
        winsound.PlaySound('sonidos/smb3_sound_effects_thwomp.wav', winsound.SND_FILENAME)
    elif situacion>=50 and situacion <=60:
        print("¡Te ha caido una estalactita en el pie!\nHas perdido 100 de vida y pierdes 5 de vida por zona.")
        jugadorhp=jugadorhp-100
        recuperacion=recuperacion-10
        winsound.PlaySound('sonidos/smb3_sound_effects_thwomp.wav', winsound.SND_FILENAME)
    elif situacion>=60 and situacion <=70:
        print("¡Te ha caido una estalactita en la cabeza!\nHas perdido 50 de vida y pierdes 5 de vida por zona.")
        jugadorhp=jugadorhp-50
        recuperacion=recuperacion-10
        winsound.PlaySound('sonidos/smb3_sound_effects_thwomp.wav', winsound.SND_FILENAME)
    elif situacion>=70 and situacion <=80:
        print("¡Te has encontrado una fuente de agua celestial!\nRecuperas 20 de vida por zona.")
        recuperacion=5
        estado=estado+5
        winsound.PlaySound('sonidos/smb3_sound_effects_1_up.wav', winsound.SND_FILENAME)
    elif situacion>=70 and situacion <=90:
        print("¡Te has encontrado a un cavernícola y te ha mordido!\nHas perdido 200 de vida.")
        jugadorhp=jugadorhp-200
        winsound.PlaySound('sonidos/smb3_sound_effects_thwomp.wav', winsound.SND_FILENAME)
    elif situacion>=90 and situacion <=100:
        daño=300*(1+(turnos/100))
        print("¡Te ha atacado un oso!\nHas perdido",daño,"de vida.")
        jugadorhp=jugadorhp-daño
        winsound.PlaySound('sonidos/smb3_sound_effects_thwomp.wav', winsound.SND_FILENAME)
    #elif situacion>=100 and situacion <=200: Queremos que pueda no ocurrir ninguna situación. 
    elif situacion>=210 and situacion <=230:
        input("Has encontrado una venda!")
        venda=0
        for i in inventario:
            if i=="Vendas":
                inventario[venda+1]=inventario[venda+1]+1
            else:
                venda=venda+1
    elif situacion>=240 and situacion <=250:
        print("¡Te has encontrado un trozo de carne!\nHas recuperado 150 de vida.")
        if jugadorhp<=851:          
            jugadorhp=jugadorhp+150
        else:
            jugadorhp=1000.0
        winsound.PlaySound('sonidos/smb3_sound_effects_1_up.wav', winsound.SND_FILENAME)
    elif situacion>=250 and situacion <=260:
        print("¡Te has encontrado a un monje!\nHas recuperado 150 de vida.")
        if jugadorhp<=850:          
            jugadorhp=jugadorhp+150
        else:
            jugadorhp=1000.0
        winsound.PlaySound('sonidos/smb3_sound_effects_1_up.wav', winsound.SND_FILENAME)
    elif situacion>=260 and situacion <=270:
        print("¡Te has encontrado a una bruja!\nHas perdido 100 de vida.")
        jugadorhp=jugadorhp-100
        winsound.PlaySound('sonidos/smb3_sound_effects_thwomp.wav', winsound.SND_FILENAME)

def stats(a,b,c,barra):
    barraxp=c/5
    barraxp=math.floor(barraxp)
    barra="="*barraxp
    for i in range(barraxp,20):
        barra=barra+("_")
    box = ('''
╔════════════════════╗
║Vida: {vida:<14}║
║Nivel: {nivel:<13}║
║Experiencia: {exp:<7}║
║{barra:<19}║
╚════════════════════╝
    ''').format(vida=a,nivel=b,exp=c,barra=barra)
    print(box)

def experienciafunc():
    global experiencia
    global lvl
    global nivel
    global turnos
    global recuperacion
    global jugadorhp
    if jugadorhp<=995:
        jugadorhp=jugadorhp+recuperacion
        if estado>=1 and jugadorhp<1000:        
            if jugadorhp<=980:               
                jugadorhp=jugadorhp+20
            else:
                jugadorhp=1000.0               
    exp=experiencia
    exp=exp+(turnos*4)+(turnos)
    if exp>=100:
        while exp>=100:
            exp=exp-100
            lvl=lvl +1
        nivel=lvl
    experiencia=exp
    
def funcionessum(): #Aquí se ejecuta todo el juego.
    global save
    global accion
    global turnos
    global estado
    if accion =="o" or accion == "O":
        funcionobjetos()
    clear()
    experienciafunc()
    if save==True:
        situaciones()
    printcueva()
    stats(jugadorhp,nivel,experiencia,barraxp)
    accion=input("¿Que deseas hacer, avanzar o usar algún objeto?\n")
    turnos=turnos+1
    save=True
    while accion not in opcionesd:
        print("Introduce una acción válida:",end=" ")
        pares=0
        for i in opcionesd:
            pares=pares+1
            if pares%2==1:
                print ("'"+i+"'",end=" ")
        accion=input("¿Que deseas hacer, avanzar o usar algún objeto?\n")     
    if estado>=1:
        estado=estado-1
    clear()

def funcionobjetos():
    global jugadorhp
    global nivel
    global experiencia
    global barraxp
    global jugadorhp
    global recuperacion
    global estado
    elegirobj=str
    numinv=0
    imprimirobjetos()
    stats(jugadorhp,nivel,experiencia,barraxp)
    elegirobj=input("Que objeto quieres usar: ")
    while elegirobj!='no' and elegirobj!='salir' and elegirobj!='s' and elegirobj!='S' and elegirobj!='Salir' and elegirobj!='No' and elegirobj!='':
        if elegirobj in inventario:
            for i in inventario:
                if elegirobj==i and inventario[numinv+1]!=0:
                    inventario[numinv+1]=inventario[numinv+1]-1
                    if i=="Pociones":
                        print("Has utilizado una poción.")
                        if jugadorhp<801:
                            jugadorhp=jugadorhp+200                          
                        else:
                            jugadorhp=1000.0 
                        clear()
                        imprimirobjetos()
                        stats(jugadorhp,nivel,experiencia,barraxp)                      
                    if i =="Vendas":
                        estado=estado+5
                        print("Has utilizado una venda.")
                        clear()
                        imprimirobjetos()
                        stats(jugadorhp,nivel,experiencia,barraxp)
                elif elegirobj==i and inventario[numinv+1]==0:
                    print("¡No tienes mas",i,"!")
                numinv=numinv+1
        else:
            print("¡No tienes ese objeto!\n")
        numinv=0
        elegirobj=input("¿Quieres usar algun objeto de tu inventario?: ")
                               
def imprimirobjetos():
    obj=0
    for i in inventario: 
        if obj%2==0:
            print(i,end=": ")
        else:
            print(i)
        obj=obj+1

def wait():
    m.getch()
#Los objetos y stats del personaje, ya que pueden variar según nivel y experiencia.                                                                                               
print('''                                                                                                                                                                                                   
                                            `.-:::--`                                             
oMMMMMMMMMMMMMNNmdy+-                  :ohNMMMMMMMMMNds:         .dMMMN:                 /NMMMs  
oMMMMNNNNNNNNNNMMMMMMmo`            `oNMMMMNdhysyydNMMMMNs.        sMMMMo              `yMMMN:   
oMMMd           .:sNMMMN/          oNMMMmo-         .+dMMMMs`       /NMMMd`           .mMMMh`    
oMMMd              `oMMMMo       `hMMMm:               :mMMMm`       .dMMMN:         /NMMM+      
oMMMd                :MMMM:      hMMMd`                 `dMMMd`        sMMMMo      `yMMMm-       
oMMMd                 sMMMm     :MMMM.                   `NMMMo         :NMMMh`   .mMMMy`        
oMMMd                 -MMMM-    hMMMh                     sMMMN          .dMMMm. :NMMN/          
oMMMd                 `MMMM/    NMMMo                     :MMMM`           sMMMNsMMMd.           
oMMMd                 `MMMM/    NMMM+                     :MMMM.            :NMMMMMo             
oMMMd                 -MMMM-    mMMMs                     +MMMN              .MMMM/              
oMMMd                 sMMMN     oMMMN`                    dMMMy              `MMMM-              
oMMMd                -NMMM+     `mMMMy                   oMMMN.              `MMMM-              
oMMMd               -NMMMy       .NMMMh`               `sMMMM:               `MMMM-              
oMMMd            `:yMMMMs         `hMMMNs-           .oNMMMm-                `MMMM-              
oMMMNssssssssyyhmMMMMMh-            /dMMMMmyo/:::/oymMMMMN+                  `MMMM-              
oMMMMMMMMMMMMMMMMMmh+.                -odMMMMMMMMMMMMMms:                    `MMMM-              
.::::::::::::::-.                        `-/+osssso/-`                        ::::`              
''')                                                                                                                                                                                                  
print('''
╔══════════════════════════════════════════════════════════════════════════════════════════════╗
║                                           Comandos                                           ║
╠══════════════════════════════════════════════════════════════════════════════════════════════╣
║                     IZQUIERDA [i]  DERECHA [d]  AVANZAR [a]  OBJETOS [o]                     ║
╚══════════════════════════════════════════════════════════════════════════════════════════════╝
''')
winsound.PlaySound('sonidos/smb3_sound_effects_warp_whistle.wav', winsound.SND_FILENAME)
print(input("Pulsa una tecla para continuar..."))
volverajugar=True
while volverajugar==True:
    while (jugadorhp>0.01 and accion in opcionesd):
        funcionessum()
    print("¡Has perdido!")
    winsound.PlaySound('sonidos/smb3_sound_effects_lost_life.wav', winsound.SND_FILENAME)
    volverajugar=input("¿Quieres volver a jugar?(S|N)")
    if volverajugar =="S" or volverajugar=="s":
        volverajugar=True
    else:
        volverajugar=False