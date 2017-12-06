
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
public class Demo1 {
    public static void main(String[] args) {
        //int num= 10/0;
        //int valor = Integer.parseInt("Loja");
        int num=0;
        int denominador;
        int numerador;
        Scanner entrada = new Scanner(System.in);
    do{
        System.out.println("Ingrese el nominador");
        numerador=entrada.nextInt();
        System.out.println("Ingrese el denominador");
        denominador=entrada.nextInt();
     try{
         num=numerador/denominador;
         
     }catch (ArithmeticException e){
         System.out.println(e);
     }
        System.err.println("Resultado: "+num);
            
    }while(denominador==0);
                    
    }
    }

    

