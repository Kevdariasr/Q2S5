package com.mycompany.ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

    private Scanner leer;
    double altura = 0, radio =0, volumen =0, area = 0;
    double pi = 3.14;
    
    public void leer(){
        
        leer= new Scanner(System.in);
        System.out.println("Digite la altura del cilindro : ");
        altura = leer.nextInt();
        
        System.out.println("Digite el radio: ");
        radio = leer.nextInt();
    
    }
    
    public void calcular (){
        area = 2*pi * radio *(radio+altura);
        volumen = pi * radio * radio * altura;
    }
    
    public void imprimir(){
        
        System.out.println("El area del cilindro es: "+ area);
        System.out.println("El volumen del cilindro: "+ volumen);
    }
    
    public static void main(String[] args) {
        
        Ejercicio5 llamar = new Ejercicio5();
        llamar.leer();
        llamar.calcular();
        llamar.imprimir();
        
        
    }
}
