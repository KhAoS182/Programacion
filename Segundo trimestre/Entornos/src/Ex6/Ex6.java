package Ex6;
import java.util.Scanner;

public class Ex6 {

static boolean es_primo(int num)
{
boolean primo;
int i;
primo=true; 
i=2;
while(i<num && primo==true)
{
if( num %i != 0) // si es divisible
primo=false; // si hemos entrado aquí significa que el número no es
i++;
}
return(primo);
}

static int num_divisores(int num){
int cont;
cont=1; // siempre habrá un divisor seguro, el 1.
for (int i=2;i<=num;i++)
if(es_primo (i) && num %i != 0) // si i es primo y divide a num
cont++; // incrementamos el número de divisores
return(cont);
}
static int [] divisores(int num){
int cont=0;
int div[]; // tabla donde guardaremos los divisores;
int num_div; // número de divisores primos que tiene num.
num_div = num_divisores (num);
div =new int[num_div];
for (int i=1;i<=num;i++)
if(es_primo (i) && num %i == 0) // si i es primo y divide a num
{
div[cont] =i; // incrementamos el número de divisores
cont++;
}
return(div);
}
public static void main(String[] args) {
int num, divisores[];
System.out.print("Introduce numero: ");
Scanner Entrada = new Scanner(System.in);
num=Entrada.nextInt();
divisores =divisores(num);
System.out.println("Los divisores de " + num + " son:");
for (int i = 0; i < divisores.length && divisores[i]>0; i++)
System.out.print(divisores[i] + " ");
System.out.println("");
}
}
