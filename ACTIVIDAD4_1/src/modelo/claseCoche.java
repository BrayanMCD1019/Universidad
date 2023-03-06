/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author braya
 */
public class claseCoche {
    //atributos de la clase//
    private String color;
    private String marca;
    private String modelo;
    private int numCaballos;
    private int numPuertas;
    private String matricula;
    
    //bloques constructores//
    public claseCoche(){
        this.color = "";
        this.marca = "";
        this.modelo = "";
        this.matricula = "";
        this.numCaballos = 0;
        this.numPuertas = 0;  
    }
    
    //getters and setters//
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNumCaballos(int numCaballos) {
        return this.numCaballos;
    }
    public void setNumCaballos(int numCaballos) {
        this.numCaballos = numCaballos;
    }
    public int getNumPuertas() {
        return this.numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //metodos de la clase//
    @Override
    public String toString(){
        
        return "Color coche = " + color + " Marca = " + marca + " Modelo = " + modelo + " Cantidad de caballos = " + numCaballos + " Cantidad de puertas = " + numPuertas + " Matricula = " + matricula;
        
    }
    
}
