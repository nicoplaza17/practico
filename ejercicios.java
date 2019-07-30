/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package javaapplication1;

import java.util.Scanner;*/
 * @author nico
 
public class ejercicios de sintaxis{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  ejercicio1*/
        int n1 = 0;
        System.out.println(n1);
        
        long n2 = 1000;
        System.out.println(n2);
        
        float n3 = 3.4f;
        System.out.println(n3);
        
        double n4 = 34.45;
        System.out.println(n4);
        
        char n5 = 's';
        System.out.println(n5);
        
        boolean n6 = true;
        System.out.println(n6);
        
        String n7 = "hola mundo";
        System.out.println(n7);
        
        /*ejercicio2*/
        float x1 = 5;
        float x2 = 5;
     
        float x3 = x1*x2;
        System.out.println(x3);
        x3 = x1/x2;
        System.out.println(x3);
        x3= (x1+x2) /2;
        System.out.println(x3);     
         
        /*ejercicio3*/
        if(x1>x2){
            System.out.println(x1+ " es mayor que " +x2);
        }else if (x1==x2){
            System.out.println(x1+" son iguales "+ x2);
        }
        
        else {
            System.out.println(x2+ " es mayor que "+x1);
        }
        /*ejercicio4*/
        Scanner nico = new Scanner(System.in);
        System.out.println("Hola, ingrese su nombre: ");
        String nombre;
        nombre = nico.nextLine();
        /*System.out.println("Buenos dias "+nombre);*/
        
        /*ejercicio5*/
        Calendar c = Calendar.getInstance();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        
        if (hora >=6 && hora<=12 ){
            System.out.println("Buenos Dias "+nombre+ " son las "+hora);
        }else if (hora >=13 && hora<=20){
            System.out.println("Buenos Tardes "+nombre+ " son las "+hora); 
        }else{
            System.out.println("Buenos  "+nombre+ " son las "+hora);
        }
        
    
        /*ejercicio6*/
        
    

        int numero1 = 0;
        while(numero1 >10 || numero1 <1){
        Scanner escaner2 = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10:");
        numero1= escaner2.nextInt();
        if(numero1>10 || numero1<1){
            System.out.println("El numero debe ser entre el 1 y 10");
        }else{
        break; 
                
                    }    
        }
   
        
                
        
        
        int numero2;
        while(true){
        Scanner escaner3 = new Scanner(System.in);
        System.out.println("Ingrese otro numero del 1 al 10:");
        numero2= escaner3.nextInt();
        if (numero2 >10 || numero2 <1){
            System.out.println("El numero debe ser entre el 1 y 10");
        }else if(numero1==numero2){
            System.out.println("Los numeros son iguales");
        }else{
        break;    
        }
        }
        int sumade = numero1+numero2;
            System.out.println("La suma es " + sumade);
            
            
       //ejercicio 7
        int ej7;
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        ej7 = num.nextInt();
        if (ej7>0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
        //ejercicio 8
        int a=2;
        int x=1;
        switch(x){
            case 1:
                x+=5;
                System.out.println(x);
                break;
           
            case 2:
                x+=5;
                System.out.println(x);
                break;
               
            case 3:
                x+=10;
                System.out.println(x);
                break;
               
            case 4:
                x+=16;
                System.out.println(x);
                break;   
               
            case 5:
                x+=34;
                System.out.println(x);
                break;
        }
        //ejerccio 9
        int numgeneral;
        Scanner can = new Scanner(System.in);
        System.out.println("Ingrese el numero a factorizar");
        numgeneral = can.nextInt();
       
        int indice=1;
        int resultado=indice;
        while(indice != numgeneral){
            indice+=1;
            resultado = resultado * indice;
        }
        System.out.println("en numero factorizado queda "+resultado);
       
        //ejercicio 10
        int rad;
        int longi;
       
        Scanner radio = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        rad = radio.nextInt();
        Scanner longit = new Scanner(System.in);
        System.out.println("Ingrese la longitud");
        longi=longit.nextInt();
        double area = Math.PI*Math.pow(rad,2);
        double volumen = area*longi;
        System.out.println("El volumen es de "+volumen+" y el area es de "+area);
       
       
       
       
           }
        }


       
  
            
         
        
        
            
            
        
        
      
        


         
    
        
    

            
        
      
    
      
        
         
        
        


 
            

            

        
    
        
        
        
    
    
    
    
    
    
    
    
    
                

        
        
  
                  
        
        
        
        
    
  

