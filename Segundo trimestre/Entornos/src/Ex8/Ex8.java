package Ex8;
import java.util.Scanner;

public class Ex8 {

static int suma_divisores_propios (int num){
int suma = 0;
for (int i=1;i<num;i++){// al ser hasta i<num no tenemos en cuenta el propio num // si i divide a num
    if (num%i==0)
	suma+=i;
}// acumulamos i
return(suma);
}
public static void main(String[] args) {
int a,b;
System.out.print("Introduce a: ");
Scanner Entrada = new Scanner(System.in);
a=Entrada.nextInt();
System.out.print("Introduce b: ");
b=Entrada.nextInt();
if (a==suma_divisores_propios (b) && b==suma_divisores_propios (a))
System.out.println(a+ " y " +b+ " son amigos.");
else{
System.out.println(a+" y "+b+" no son amigos...\nLa siguiente vez prueba con 220, 284.");
}
}
}
