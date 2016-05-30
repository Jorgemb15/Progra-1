/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.de.video;

import java.util.Scanner;

/**
 *
 * @author UMCA
 */
public class ClubDeVideo {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        String titulo;
        int año;
        String productor;
        String formato;
        String genero;
        
        Pelicula pelicula = new Pelicula();
        
        Scanner sc = new Scanner(System.in);
        String[][] Peliculas = new String[4][5];
        
        
        System.out.print("Club de Video\n");
        System.out.print("1. Agregar Peliculas\n");
        System.out.print("2. Listar Peliculas\n");
        System.out.print("3. Alquilar Peliculas\n");
        System.out.print("4. Devolver Peliculas\n");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:  
                
                    System.out.print("Dijite el Titulo de la Pelicula: ");
                    titulo = sc.next();
                    System.out.print("Dijite el Año de la Pelicula: ");
                    año = sc.nextInt();
                    System.out.print("Dijite el Productor de la Pelicula: ");
                    productor = sc.next();
                    System.out.print("Dijite el Formato de la Pelicula: ");
                    formato = sc.next();
                    System.out.print("Dijite el Genero de la Pelicula: ");
                    genero = sc.next();
                    
                    pelicula.settitulo(titulo);
                    pelicula.setaño(año);
                    pelicula.setproductor(productor);
                    pelicula.setformato(formato);
                    pelicula.setgenero(genero);
                    
                    Peliculas = pelicula.agregarpelicula(Peliculas);
                    
                     break;
            case 2:
                break;
        }
        
             
    }
          
}
