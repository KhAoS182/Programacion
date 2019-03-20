#Projecte de primer trimestres
#Adrian Garcia Trias y Andrés Seguí Sastre
#Recomendamos utilizar la shell en pantalla completa, ya que algunos dibujos pueden no tener sentido.
import random
import math #Hemos esta utilidat para convertir float a integers.
import msvcrt as m
import cuevas
def wait():
    m.getch()
#Los objetos y stats del personaje, ya que pueden variar segun nivel y experiencia.
jugadorhp=1000.0
recuperacion=5
defensa=5
nivel=0
cueva=0
barraxp=0
turnos=0
experiencia=0
opciones=["i","a","s","d","stats","st"]
opcionesd=[]#opciones disponibles
inventario=["Pociones",1,"Vendas",5]
objetos=["Pociones","Vendas","Sombrero","Lápiz"]
accion="i"
#Como se dibujaran las cuevas
def printcueva():  #3 opcions 
    cueva=random.randint(0,100)
    if cueva >=0 and cueva <=30:
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
                        cova 1 gr1                ''')
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
                cova 2 gr1    ''')
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
                        cova 3 gr1''')
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
                        cova 4 gr1''')
    elif cueva >=31 and cueva <=60:#2 opciones
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
                    cova 5 gr3''')
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
                cova6 gr3''')
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
  cova 7 gr2         ''')     
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
                    cova 8 gr3''')                                               
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
    cova 9 gr3               ''')
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
                    cova 10gr3''')     
            situaciones()
    else:
        cueva=random.randint(0,1)
        if cueva==0:
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
   cova 11 gr4            
            ''')                  
def situaciones():#need ideas
    x=0
def stats(a,b,c,d):
    exp=math.floor(c)
    print()   
    print("Vida: %.1f \nNivel: %i"%(a,b))
    for i in range (0,exp):
        print(end="=")
    for i in range(exp,20):
        print(end="_")
    print("%.2f"%(d)+"%")
    print("\n")
def experienciafunc(exp,turnos,barra,lvl):
    global experiencia
    global nivel
    exp=experiencia
    exp=exp+(turnos*4)+(turnos)
    barra=exp/5
    if exp>=100:
        while exp>=100:
            exp=exp-100
            lvl=lvl +1
        nivel=lvl
    experiencia=exp
def statsobjetos():
    global objetos

          
print("Comandos: IZQUIERDA('i'), DERECHA('d'), AVANZAR('s'), OBJETOS('o') y STATS('st')\n\n\n")

while jugadorhp>0.01 and accion in opciones: 
    experienciafunc(experiencia,turnos,barraxp,nivel)
    stats(jugadorhp,nivel,barraxp,experiencia)
    accion=input("Que desea hacer, avanzar o usar algún objeto?\n")
    cuevas.printcueva()
    turnos=turnos+1

# https://insiders.liveshare.vsengsaas.visualstudio.com/join/?D7ECE64567B9CF1238F58F8B51CB08E0CB40
