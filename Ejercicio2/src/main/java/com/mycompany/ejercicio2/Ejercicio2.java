package com.mycompany.ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

    private Scanner leer;
    String nombre="";
    double salmensual=0;
    double porc_ccss=0;
    double porc_pop=0;
    double ded_ccss=0;
    double ded_bpop=0;
    double tot_deduc=0;
    double sal_neto=0;
    
    public void leer(){
        leer=new Scanner(System.in);
        
        System.out.print("Digite el nombre: ");
        nombre = leer.next();
        
        System.out.print("Digite el salario mensual: ");
        salmensual = leer.nextDouble();
    }
    
    public void Calcular_deducciones(){
        
        ded_ccss = salmensual * porc_ccss;
        ded_bpop = salmensual * porc_pop;
        tot_deduc = ded_ccss + ded_bpop;
        sal_neto = salmensual - tot_deduc;
        
    }
    public void mostrar(){
        System.out.print("Estimado empleado : "+nombre);
        System.out.print("En este mes su salario se desglosa de la siguiente manera: ");
        System.out.print("Salario mensual : "+salmensual);
        System.out.print("Salario bruto : "+salmensual);
        System.out.print("Deducciones CCSS : "+ded_ccss);
        System.out.print("Deducciones del Banco : "+ ded_bpop);
        System.out.print("Total de deducciones : "+ tot_deduc);
        System.out.print("salario neto : "+ sal_neto);
        
        
    }
    
    public static void main(String[] args) {
        Ejercicio2 llamar = new Ejercicio2();
        llamar.leer();
        llamar.Calcular_deducciones();
        llamar.mostrar();
      
    }
}
