/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_denislopez;
import java.util.Scanner;
/**
 *
 * @author djlop
 */
public class Examen1P1_DenisLopez {
    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op = menú();
        while (op!=4){
            switch (op){
                case 1:{
                    break;
                }
                case 2:{
                  //MCM();
                  break;
                }
            }
            
        }
        op = menú();
    }
    
    public static int menú(){
        System.out.println("Menu");
        System.out.println("1. Sumatoria con Math.Pow");
        System.out.println("2. Mínimo Común Múltiplo");
        System.out.println("3. Cifrado Dinamico");
        System.out.println("Ingrese su opcion: ");
        int opcion = leer.nextInt();
        return opcion;
    }
    
    public static double calcularSuma(int N){
        System.out.println("Ingrese el valor de N(entero positivo): ");
        N = leer.nextInt();
        double formula;
        double division;
        double suma;
        double parcial=0;
        if (N<=0){
          System.out.println("El numero debe ser mayor que 0.");  
        }
        for (int i=0;i<=N;i++){
            formula = Math.pow(i,2);
            division = Math.pow(2,i);
            suma = (3*(formula)+2)/ (division);
            parcial+=suma;
            System.out.println("Iteracion 1: termino = "+suma+", suma parcial: "+parcial);  
        }
        System.out.println("La suma total S es: "+parcial);  
        return  parcial;
    }
    
    //public static int MCM(){
       // System.out.println("Ingrese num1: ");  
       // int num1 = leer.nextInt();
        //System.out.println("Ingrese num2: ");
       // int num2 = leer.nextInt();
       //int formula;
        //int residuo;
       //int residuo2;
       // if(num1>num2){
            //formula= num1/num2;
            //residuo=num1%num2;
            //if (residuo!=0){
                
          //  }
            
        //}
      //  return ;
    //}
    
    public static void cifrado(){
       System.out.println("Ingrese la cadena a crirar (no puede estar vacia): "); 
       String cadena = leer.next();
       String alfabeto = "abcdefghijklmnophrstuvwxyz";
       if (cadena==" "){
           System.out.println("ERROR: La cadena no puede estar vacia. Intente de nuevo.");  
       }
       System.out.println("Ingrese el desplazamiento inicial puede ser positivo o negativo, distinto de 0: "); 
       int desplazamiento = leer.nextInt();
       if (desplazamiento==0){
           System.out.println("ERROR: El desplazamiento no puede sero 0. Intente de nuevo.");  
       }
       for (int i=0;i<=cadena.length();i++){
           
       }
        
    }
    
}
