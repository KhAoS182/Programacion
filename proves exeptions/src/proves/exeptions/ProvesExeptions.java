/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proves.exeptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Adrian
 */
public class ProvesExeptions {
    int SIZE = 1000;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
    }
    public void writeList() throws IOException {
PrintWriter out = null;
try {
System.out.println("Entering try statement");
out = new PrintWriter(
new FileWriter("OutFile.txt"));
for (int i = 0; i < SIZE; i++)
out.println("Value at: "
+ i + " = "
+ vector.elementAt(i));
} catch (ArrayIndexOutOfBoundsException e) {
System.err.println("Caught "
+ "ArrayIndexOutOfBoundsException: "
+ e.getMessage());
} catch (IOException e) {
System.err.println("Caught IOException: "
+ e.getMessage());
} finally {
if (out != null) {
System.out.println("Closing PrintWriter");
out.close();
}
else {
System.out.println("PrintWriter not open");
}
}
}
