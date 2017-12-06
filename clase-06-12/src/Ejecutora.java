
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
public class Ejecutora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero_alumno = 4;
        int contador = 1;
        //double resul;
        Estudiante [] lista = new Estudiante [4];
        double [] notas_matematicas = new double [4];
        double [] notas_sociales = new double [4];
            
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido=entrada.nextLine();
        
        System.out.println("Ingrese su de nota_matematicas");
        String nota_mate=entrada.nextLine();
        System.out.println("Ingrese su de nota_sociales");
        String  nota_soci=entrada.nextLine();   
        
        //Captura excepción
         try{
            contador = contador +1;
                     
         }catch (NumberFormatException e){
             System.err.println("error en los datos ingresados");
         }  
}
    }
        
