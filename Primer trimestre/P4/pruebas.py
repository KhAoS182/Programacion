a = int(input("Ingresa un numero: "))
b = True;
for i in range (2,a-1):
	if a%i!=0:
		x = 1	
	else:
		b=False
		print("ha entrado")
print(b)
