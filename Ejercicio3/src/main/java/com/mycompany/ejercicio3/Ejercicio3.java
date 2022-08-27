package com.mycompany.ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

    private Scanner leer;
    int n1,n2,n3 =0;
    
    public void leer_numeros(){
        leer = new Scanner(System.in);
        
        System.out.println("Digite el primer nuemro:");
        n1 = leer.nextInt();
        
        System.out.println("Digite el segundo nuemro:");
        n2 = leer.nextInt();
        
        System.out.println("Digite el tercer nuemro:");
        n3 = leer.nextInt();
        
    }
    
    public void decidir(){
        if (n1==n2 & n2==n3){
            System.out.println("Los numero son iguales");
        } else{
            if (n1>n2 & n1>n3){
                System.out.println(n1+" es el mayor");
            } else {
                if (n2>n3){
                    System.out.println(n2+" es el mayor:");
                } else{
                    System.out.println(n3+" es el mayor");
                }
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        Ejercicio3 llamar = new Ejercicio3();
        
        llamar.leer_numeros();
        llamar.decidir();
        
    }
}
