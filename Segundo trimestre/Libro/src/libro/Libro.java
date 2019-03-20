/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Libro {

    private String titulo;
    private String autor;
    private int isbn_nuevo;
    private int num_ejem_pres;
    private int num_ejem_tot;
    static private int num_ejem_pres_glob;
    static private int num_ejem_tot_glob;
    public Libro() {
    }

    public Libro(String titulo, String autor, int isbn, int num_ejem_pres, 
            int num_ejem_tot) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn_nuevo = isbn;
        this.num_ejem_pres = num_ejem_pres;
        this.num_ejem_tot = num_ejem_tot;
        Libro.num_ejem_pres_glob += num_ejem_pres;
        Libro.num_ejem_tot_glob += this.num_ejem_tot;
    }

    public Libro(Libro a) {
        this.titulo = a.titulo;
        this.autor = a.autor;
        this.isbn_nuevo = a.isbn_nuevo;
        /* quizás en el constructor copia no tiene sentido copiar un libro y 
        que ya
        establezcamos una serie de número de ejemplares prestados, aunque no 
        lo indicaba el ejercicio, asumimos que copiamos todos los elementos
        excepto los ejemplares prestado que los dejaremos a cero
         */
        this.num_ejem_pres = 0;
        this.num_ejem_tot = a.num_ejem_tot;
        /*        Libro.num_ejem_pres_glob+=num_ejem_pres; */
        Libro.num_ejem_tot_glob += this.num_ejem_tot;
    }


    public int getNum_ejem_pres(Libro libro) {
        return libro.num_ejem_pres;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn_nuevo() {
        return isbn_nuevo;
    }

    public void setIsbn_nuevo(int isbn_nuevo) {
        this.isbn_nuevo = isbn_nuevo;
    }

    public void setNum_ejem_pres(int num_ejem_pres) {
        this.num_ejem_pres = num_ejem_pres;
    }

    public int getNum_ejem_tot() {
        return num_ejem_tot;
    }

    public void setNum_ejem_tot(int num_ejem_tot) {
        this.num_ejem_tot = num_ejem_tot;
    }

    public static int getNum_ejem_pres_glob() {
        return num_ejem_pres_glob;
    }

    public static void setNum_ejem_pres_glob(int num_ejem_pres_glob) {
        Libro.num_ejem_pres_glob = num_ejem_pres_glob;
    }

    public static int getNum_ejem_tot_glob() {
        return num_ejem_tot_glob;
    }

    public static void setNum_ejem_tot_glob(int num_ejem_tot_glob) {
        Libro.num_ejem_tot_glob = num_ejem_tot_glob;
    }

    public boolean prestar_Libro() {
        if (this.num_ejem_tot > this.num_ejem_pres) {
            this.num_ejem_pres++;
            Libro.num_ejem_pres_glob++;
            return true;
        } else {
            return false;
        }
    }

    static public void pedir_prestar_Libro(ArrayList<Libro> p) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Qué libro deseas prestar? Introduce el ISBN");
        int a = lector.nextInt();
        boolean encontrado = false;
        int i = 0;
        while ((i < p.size()) && (encontrado == false)) {
            if (p.get(i).getIsbn_nuevo() == a) {
                if (p.get(i).prestar_Libro()) {
                    System.out.println("El ejemplar existe. El libro ha sido "
                            + "prestado");
                } else {
                    System.out.println("Lo sentimos, todos los ejemplares estan"
                            + " prestados, NO se ha podido prestar el libro");
                }
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado == false) {
            System.out.println("El ejemplar no existe. El libro NO se ha "
                    + "prestado");
        }
    }

    public boolean devolver_Libro() {
        if (this.num_ejem_pres > 0) {
            this.num_ejem_pres--;
            Libro.num_ejem_pres_glob--;
            return true;
        } else {
            return false;
        }
    }

    static public void pedir_devolver_Libro(ArrayList<Libro> p) {
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Qué libro deseas devolver? Introduce el ISBN");
        int a = lector.nextInt();
        boolean encontrado = false;
        int i = 0;
        while ((i < p.size()) && (encontrado == false)) {
            if (p.get(i).getIsbn_nuevo() == a) {
                System.out.println("El ejemplar existe. El libro ha sido "
                        + "devuelto");
                p.get(i).devolver_Libro();
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado == false) {
            System.out.println("El ejemplar no existe. El libro NO se ha "
                    + "prestado");
        }
    }

    public void mostrar_Libro() {
        System.out.println("======================");
        System.out.println("FICHA DEL LIBRO       ");
        System.out.println("----------------------");
        System.out.println("Titulo: " + this.getAutor());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ejemplares prestados: " + 
                this.getNum_ejem_pres(this));
        System.out.println("Ejemplares totales: " + this.getNum_ejem_tot());
        System.out.println("======================");
    }

    static public void localizar_Libro(ArrayList<Libro> p, boolean nuevoparam) {
        Scanner lector = new Scanner(System.in);
        boolean encontrado = false;
        System.out.println("======================");
        System.out.println("LOCALIZADOR DE LIBROS ");
        System.out.println("----------------------");
        System.out.println("¿Qué libro deseas localizar? Introduce el ISBN");
        int a = lector.nextInt();
        int i = 0;
        while ((i < p.size()) && (encontrado == false)) {
            if (p.get(i).getIsbn_nuevo() == a) {
                System.out.println("El ejemplar existe. Esta es su información "
                        + "actualizada:");
                p.get(i).mostrar_Libro();
                encontrado = true;
            } else {
                i++;
            }
        }
        if (encontrado == false) {
            System.out.println("El ejemplar no existe. El libro NO se ha locali"
                    + "zado");
        }
    }

    static public Libro crear_Libro() {
        Scanner lector = new Scanner(System.in);
        Libro milibro = new Libro();
        System.out.println("======================");
        System.out.println("CREAR LIBRO... ");
        System.out.println("----------------------");
        System.out.println("¿Introduce el TITULO del libro?");
        milibro.setTitulo(lector.nextLine());
        System.out.println("¿Introduce el AUTOR del libro?");
        milibro.setAutor(lector.nextLine());
        System.out.println("¿Introduce el ISBN del libro?");
        milibro.setIsbn_nuevo(lector.nextInt());
        System.out.println("¿Introduce el NÚMERO DE EJEMPLARES TOTALES del "
                + "libro?");
        milibro.setNum_ejem_tot(lector.nextInt());
        milibro.setNum_ejem_pres(0);
        return milibro;
    }
}
