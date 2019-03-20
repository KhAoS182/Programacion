b= int(input('Alçada del triangle: '))
#for i in range (1,b+1):
 #   print ("*"*i)
print (" "*b, "*")
for i in range (1,b):
    print (" "*(b-i), "*"*(i+1) +"*"*i )
