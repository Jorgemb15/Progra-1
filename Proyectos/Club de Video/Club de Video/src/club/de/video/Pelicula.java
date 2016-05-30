/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.de.video;

/**
 *
 * @author UMCA
 */
public class Pelicula {
    private String titulo;
    private int año;
    private String productor;
    private String formato;
    private String genero;
    
    
    public Pelicula(){
        
    }
    
    
    /*Titulo*/
    public String gettitulo() {
        return titulo;
    }
    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /*año*/
    public int getaño() {
        return año;
    }
    public void setaño(int año) {
        this.año = año;
    }
    
    /*productor*/
    public String getproductor() {
        return productor;
    }
    public void setproductor(String productor) {
        this.productor = productor;
    }
    
    /*formato*/
    public String getformato() {
        return formato;
    }
    public void setformato(String formato) {
        this.formato = formato;
    }
    
    /*genero*/
    public String getgenero() {
        return genero;
    }
    public void setgenero(String genero) {
        this.genero = genero;
    }
    
    
    public String[][] agregarpelicula(String[][] peliculas) {
        
        for (int f=0; f<4;f++){
            for(int c=0;c<5;c++){
                if(peliculas[f][c] == null ){
                    switch (c) {
                    case 0:
                        peliculas[f][c] = titulo;
                        break;
                    case 1:
                        peliculas[f][c] = String.valueOf(año);
                        break;
                    case 2:
                        peliculas[f][c] = productor;
                        break;
                    case 3:
                        peliculas[f][c] = formato;
                        break;
                    case 4:
                        peliculas[f][c] = genero;
                        break;
                    }
                }
            }
        }
        
        return peliculas;
    }
    
    
    
}
