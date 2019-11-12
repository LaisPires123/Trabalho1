/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class Circulos extends FiguraGeometrica {
    
    private double raio;
    private double perimetro;
    private double area;
    Scanner input = new Scanner(System.in);

    
    public double getPerimetro() {
        return perimetro;
    }
    
    @Override
    public double calcPerimetro(){
        
        this.perimetro=this.raio*2*3.14;
        return this.perimetro;
    }

    public double getArea() {
        return area;
    }
    
    @Override
    public double calcArea(){
        
        this.area= this.raio*this.raio*3.14;
        return this.area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
    
}
