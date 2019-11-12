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

public class Principal {
    
    public static void main (String[] args){
        
        FiguraGeometrica listaf[] = new FiguraGeometrica[4];
        double somaP = 0;
        double somaA = 0;
        
        Scanner input = new Scanner (System.in);
        
        for (int i = 0; i < listaf.length; i++) {
            if (i < 2) {
                System.out.println("Digite o raio do círculo " + (i + 1));
                Circulos c = new Circulos();

                c.setRaio(input.nextDouble());
                listaf[i] = c;

            } else {
                System.out.println("\nDigite a base do retângulo " + (i - 1));
                Retangulo a = new Retangulo();
                a.setComprimento(input.nextDouble());

                System.out.println("\nDigite a altura do retângulo " + (i - 1));
                a.setAltura(input.nextDouble());
                listaf[i] = a;
            }

        }
        for (int i = 0; i < listaf.length; i++) {

            somaA += listaf[i].calcArea();
            somaP += listaf[i].calcPerimetro();

            if (i < 2) {

                System.out.println("Circulo " + (i + 1) + "\nÁrea: " + listaf[i].getArea() + "\nPerímetro: " + listaf[i].getPerimetro());

            } else {
                System.out.println("Retangulo " + (i - 1) + "\nÁrea: " + listaf[i].getArea() + "\nPerímetro: " + listaf[i].getPerimetro());

            }

        }

        System.out.println("\nA soma de todos os perímetros é: " + somaP);
        System.out.println("A soma de todas as áreas é: " + somaA);

    }

}
       

