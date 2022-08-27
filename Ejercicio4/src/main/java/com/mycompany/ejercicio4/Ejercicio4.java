package com.mycompany.ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

    private Scanner leer;
    double valor = 350, cantidad = 0, total = 0;
    
    
    public void leer(){
        
        leer= new Scanner(System.in);
        System.out.println("Digite la cantidad de flores que va a comprar: ");
        cantidad = leer.nextInt();
        
        
    }
    
    public void decidir(){
        if (cantidad>10) total = cantidad * valor * 0.90;
        
        else total=cantidad * valor;
    }
    
    public void imprimir(){
        
        System.out.println("La cantidad de flores que va a llevar es: "+ cantidad);
        System.out.println("El costo total a pagar es: "+ total);
        
    }
    
    public static void main(String[] args) {
        Ejercicio4 llamar = new Ejercicio4();
        llamar.leer();
        llamar.decidir();
        llamar.imprimir();
    }
}
