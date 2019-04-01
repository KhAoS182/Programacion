/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Rafael
 */
public class LibroTest {
    
    public LibroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTitulo method, of class Libro_EX1.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Libro_EX1 instance = new Libro_EX1();
        instance.setTitulo("pepe");
        String expResult = "pepe";
        //String result = instance.testGetTitulo(null, null);
        //assertEquals(expResult, result);
    }

    /**
     * Test of setTitulo method, of class Libro_EX1.
     */
    @Ignore
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Libro_EX1 instance = new Libro_EX1();
        instance.setTitulo(titulo);
    }

    /**
     * Test of getAutor method, of class Libro_EX1.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        Libro_EX1 instance = new Libro_EX1();
        instance.setAutor("peautor");
        String expResult = "peautor";
        String result = instance.getAutor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAutor method, of class Libro_EX1.
     */
    @Ignore
    public void testSetAutor() {
        System.out.println("setAutor");
        String autor = "";
        Libro_EX1 instance = new Libro_EX1();
        instance.setAutor(autor);
    }

    /**
     * Test of getIsbn method, of class Libro_EX1.
     */
    @Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        Libro_EX1 instance = new Libro_EX1();
        int expResult = 55;
        instance.setIsbn_nuevo(55);        
        int result = instance.getIsbn_nuevo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIsbn method, of class Libro_EX1.
     */
    @Ignore
    public void testSetIsbn() {
        System.out.println("setIsbn");
        int isbn = 0;
        Libro_EX1 instance = new Libro_EX1();
        instance.setIsbn_nuevo(isbn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum_ejem_pres method, of class Libro_EX1.
     */
    @Test
    public void testGetNum_ejem_pres() {
        System.out.println("getNum_ejem_pres");
        Libro_EX1 instance = new Libro_EX1();
        int expResult = 10;
        instance.setNum_ejem_pres(10);        
        int result = instance.getNum_ejem_pres();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNum_ejem_pres method, of class Libro_EX1.
     */
    @Ignore
    public void testSetNum_ejem_pres() {
        System.out.println("setNum_ejem_pres");
        int num_ejem_pres = 0;
        Libro_EX1 instance = new Libro_EX1();
        instance.setNum_ejem_pres(num_ejem_pres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum_ejem_tot method, of class Libro_EX1.
     */
    @Test
    public void testGetNum_ejem_tot() {
        System.out.println("getNum_ejem_tot");
        Libro_EX1 instance = new Libro_EX1();
        int expResult = 10;
        instance.setNum_ejem_tot(10);        
        int result = instance.getNum_ejem_tot();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNum_ejem_tot method, of class Libro_EX1.
     */
    @Ignore
    public void testSetNum_ejem_tot() {
        System.out.println("setNum_ejem_tot");
        int num_ejem_tot = 0;
        Libro_EX1 instance = new Libro_EX1();
        instance.setNum_ejem_tot(num_ejem_tot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum_ejem_pres_glob method, of class Libro_EX1.
     */
    @Test
    public void testGetNum_ejem_pres_glob() {
        System.out.println("getNum_ejem_pres_glob");
        int expResult = 100;
        Libro_EX1.setNum_ejem_pres_glob(100);        
        int result = Libro_EX1.getNum_ejem_pres_glob();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNum_ejem_pres_glob method, of class Libro_EX1.
     */
    @Ignore
    public void testSetNum_ejem_pres_glob() {
        System.out.println("setNum_ejem_pres_glob");
        int num_ejem_pres_glob = 0;
        Libro_EX1.setNum_ejem_pres_glob(num_ejem_pres_glob);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNum_ejem_tot_glob method, of class Libro_EX1.
     */
    @Test
    public void testGetNum_ejem_tot_glob() {
        System.out.println("getNum_ejem_tot_glob");
        int expResult = 20;
        Libro_EX1.setNum_ejem_tot_glob(20);        
        int result = Libro_EX1.getNum_ejem_tot_glob();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNum_ejem_tot_glob method, of class Libro_EX1.
     */
    @Ignore
    public void testSetNum_ejem_tot_glob() {
        System.out.println("setNum_ejem_tot_glob");
        int num_ejem_tot_glob = 0;
        Libro_EX1.setNum_ejem_tot_glob(num_ejem_tot_glob);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prestar_Libro method, of class Libro_EX1.
     */
    @Test
    public void testPrestar_Libro() {
        System.out.println("prestar_Libro");
        Libro_EX1 instance = new Libro_EX1();
        boolean expResult = true;
        boolean result = instance.prestar_Libro();
        assertEquals(expResult, result);
    }

    /**
     * Test of pedir_prestar_Libro method, of class Libro_EX1.
     */
    @Test
    public void testPedir_prestar_Libro() {
        System.out.println("pedir_prestar_Libro");
        ArrayList<Libro_EX1> p = null;
        Libro_EX1.pedir_prestar_Libro(p);
    }

    /**
     * Test of devolver_Libro method, of class Libro_EX1.
     */
    @Test
    public void testDevolver_Libro() {
        System.out.println("devolver_Libro");
        Libro_EX1 instance = new Libro_EX1();
        boolean expResult = false;
        boolean result = instance.devolver_Libro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedir_devolver_Libro method, of class Libro_EX1.
     */
    @Test
    public void testPedir_devolver_Libro() {
        System.out.println("pedir_devolver_Libro");
        ArrayList<Libro_EX1> p = null;
        Libro_EX1.pedir_devolver_Libro(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar_Libro method, of class Libro_EX1.
     */
    @Test
    public void testMostrar_Libro() {
        System.out.println("mostrar_Libro");
        Libro_EX1 instance = new Libro_EX1();
        instance.mostrar_Libro();
    }

    /**
     * Test of pedir_mostrar_Libro method, of class Libro_EX1.
     */
    @Test
    public void testPedir_mostrar_Libro() {
        System.out.println("pedir_mostrar_Libro");
        ArrayList<Libro_EX1> p = null;
        Libro_EX1 milibro=new Libro_EX1("java beginning", "rafa", 3939393, 0, 10);
        p.add(milibro);
        Libro_EX1.pedir_mostrar_Libro(p);
    }

    /**
     * Test of localizar_Libro method, of class Libro_EX1.
     */
    @Test
    public void testLocalizar_Libro() {
        System.out.println("localizar_Libro");
        ArrayList<Libro_EX1> p = null;
        Libro_EX1.localizar_Libro(p, false);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_Libro method, of class Libro_EX1.
     */
    @Test
    public void testCrear_Libro() {
        System.out.println("crear_Libro");
        Libro_EX1 expResult = null;
        Libro_EX1 result = Libro_EX1.crear_Libro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
