Min=0
Max=0
a = int(input("introduce valor: "))
b = int(input("introduce valor: "))
if (a>b or a==b):
    Max=a
    Min=b
if (a<b):
    Max=b
    Min=a
c = int(input("introduce valor: "))
if (Max<c):
    Max=c
if (c<Min):
    Min=c
d = int(input("introduce valor: "))
if (Max<d):
    Max=d
if (d<Min):
    Min=d
e = int(input("introduce valor: "))
if (Max<e):
    Max=e
if (e<Min):
    Min=e
print ("El mayor es %d y el menor es %d"%(Max,Min))