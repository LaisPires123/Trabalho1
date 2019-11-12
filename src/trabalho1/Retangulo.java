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
public class Retangulo extends FiguraGeometrica{
    
    
    private double altura;
    private double comprimento;
    private double perimetro;
    private double area;

    public double getPerimetro() {
        return perimetro;
    }

    @Override
    public double calcArea() {
        this.area = this.altura*this.comprimento;
        return this.area;
    }
    
    @Override
    public double calcPerimetro(){
        
        this.perimetro = this.altura*2 + this.comprimento*2;
        return this.perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    
    
    
    
}
