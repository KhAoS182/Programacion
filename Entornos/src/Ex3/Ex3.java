package Ex3;
public class Ex3 {
 /**
 * Esto funciona solo para tablas con un tamaño mínimo de 1
 *
 */
 static int maximo(int t[]){
 int max;
 max = t[0];
 for (int i = 0; i < t.length; i++)
 if (t[i]>max) // si t[i] es mayor que max, entonces t[i] es el nuevo máximo
 max=t[i];
 return(max);
 }
 public static void main(String[] args) { 
 int max = 0;
 int[] t=new int [6];

System.out.print("Los valores son: ");
 for (int i = 0; i < t.length; i++){ // llenamos la tabla con valores aleatorios entre 1 y 100
 t[i]=(int)(Math.random()*100+1);
     System.out.print(t[i] + ",");
 }
 for (int i = 0; i < t.length; i++){
 max = maximo (t);
}
  System.out.println("\nEl número mayor es: " + max);
 }
} 
