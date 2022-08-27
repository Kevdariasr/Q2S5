package com.mycompany.semana5ejercicio1;
import java.util.Scanner;
public class Semana5Ejercicio1 {

    private Scanner leer;
    int numero;
    public void validar (){
        if (numero % 2 == 0) System.out.print("El numero " + numero + "es par");
        else System.out.print("El numero "+numero+" es impar");
    }
    public void leer(){
        leer= new Scanner(System.in);
        System.out.print("Digite el numero: ");
        numero = leer.nextInt();
        
    }
    
    public static void main(String[] args) {
        Semana5Ejercicio1 llamar =new Semana5Ejercicio1();
        llamar.leer();
        llamar.validar();
    }
}
