package Ex9;
import java.util.Scanner;

public class Ex9 {
static int suma_n_impares (int n)
{
int suma=0;
for (int i =1; i <n ; i++){
    if (i%2==1){
	suma+=i;
    }
}
return (suma);
}
public static void main(String[] args) {
int n;
System.out.print("Introduzca un numero: ");
Scanner Entrada = new Scanner(System.in);
n =Entrada.nextInt();
System.out.println("La suma de los " +n+ " primeros impares es: " +suma_n_impares (n));
}
}
