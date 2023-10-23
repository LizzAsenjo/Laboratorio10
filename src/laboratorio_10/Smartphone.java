/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_10;

/**
 *
 * @author Liz
 */
public class Smartphone implements Camara, ReproductordeMusica,
        NavegadordeInternet{
    
    private String marca;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void tomarfoto(){
        System.out.print("Estoy tomando varias fotos");
    }
    
    public void grabarvideo(){
        System.out.print("Estoy grabando videos");
    }
    
    public void reproducir(){
        System.out.print("Estoy reproduciendo la música");
    }
    
    public void detener(){
        System.out.print("Estoy deteniendo la música");
    }
    
    public void buscar(){
        System.out.print("Estoy buscando en Internet");
    }
    
    public void actualizar(){
        System.out.print("Estoy actualizando la página");
    }
}
