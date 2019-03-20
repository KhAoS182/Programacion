#Práctica 7 - Ejercicio 10 - Adrian Garcia
#Datos Preguntar una palabra y comprobar si son palídromas o no.
def ex10(x):
    a=0
    b=x[::-1]
    for i in x:
        if i!= b[a]:
            return "No lo es"
        a=a+1
    if a==len(x):
        return "Es palíndroma o capicúa"
a=input("Dime una palabra: ")
print ("La palabra %s es: "%(a),ex10(a))