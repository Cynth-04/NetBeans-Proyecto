/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cynth
 */
public class Pelicula {
    String titulo;
    String categoria;
    String clasificacion;
    int sala;  

public Pelicula (String titulo,String categoria,String clasificacion, int sala){
    this.titulo=titulo;
    this.categoria=categoria;
    this.sala=sala;    
}
public void consultar(){
    System.out.println("PELICULA");
    System.out.println("Titulo: "+titulo);
    System.out.println("Categoria: "+categoria);
    System.out.println("Clasificacion: "+clasificacion);
    System.out.println("Sala: "+ sala);
}
public static void main(String[]args){
    Pelicula pelicula=new Pelicula("Alicia en el pais de las maravillas","Infantil","Publico en general",4);
    
pelicula.consultar();
}
}
