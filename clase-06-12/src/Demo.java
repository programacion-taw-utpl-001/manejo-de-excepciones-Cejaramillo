
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class Demo {
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su edad");
        edad=entrada.nextInt();
        
        entrada.nextLine();
        System.out.println("Ingrese su nombre");
        nombre=entrada.nextLine();
       
        
        System.out.println("su nombre es: "+nombre);
        
        System.out.println("su edad es: "+ edad);
    }
}

