/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC Bruger
 */
public class Teste {
    public static void main(String[] args) {
        Caneta c = new Caneta("Preta", "Esferográfica");
        
        
        c.destamparCaneta();
        System.out.println(c.escreverPalavra("Hello World! Tudo Bem?"));
        System.out.println("Características Caneta: " + c.getTipo() + " " + c.getCor());
        System.out.println("");
        
        System.out.println(c.escreverPalavra("Hello World! Tudo Bem?"));
        
    }
}
