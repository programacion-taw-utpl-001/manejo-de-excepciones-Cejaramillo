/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class Asignaciones {
   Estudiante  [] lista_persona;
   double [] notas_matematicas;
   double [] notas_sociales;

   //Constructor de la clase
    public Asignaciones(Estudiante[] lista_persona, double[] notas_matematicas, double[] notas_sociales) {
        lista_persona = lista_persona;
        notas_matematicas = notas_matematicas;
        notas_sociales = notas_sociales;
    }
    //métodos obtener y establecer
   public Estudiante[] getLista_persona() {
        return lista_persona;
    }

    public void setLista_persona(Estudiante[] lista_persona) {
        this.lista_persona = lista_persona;
    }

    public double[] getNotas_matematicas() {
        return notas_matematicas;
    }

    public void setNotas_matematicas(double[] notas_matematicas) {
        this.notas_matematicas = notas_matematicas;
    }

    public double[] getNotas_sociales() {
        return notas_sociales;
    }

    public void setNotas_sociales(double[] notas_sociales) {
        this.notas_sociales = notas_sociales;
    }
    //envio de los tres arreglos declarados
    public void lista(){
        String lista="";
        for (int i = 0; i < 4; i++) {
            lista = lista_persona[i].toString()+notas_matematicas[i]+notas_sociales[i];
            
        }
    }
    public void obtener_prmedio_notas(){
        double valor=0, suma=0;
        double num1,num2;
        for (int i = 0; i < 4; i++) {
         num1= notas_matematicas [i];
         num2= notas_sociales [i];
         suma= num1+num2;
        }
        valor=suma/2;     
    }
    public void obtener_promedio_general(){
     double valor=0, suma=0;
        for (int i = 0; i < 4; i++) {
            
            
        }
    }
}
