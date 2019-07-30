/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author nico
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         /*MENU*/
    while(true){
        System.out.println("Prseione 1 para sumar");
        System.out.println("Prsione 2 para restar");
        System.out.println("Presione 3 para multiplicar");
        System.out.println("Pesione 4 para dividir");
        System.out.println("Presione 5para salir");
        Scanner operacion= new Scanner(System.in);
        System.out.println("Ingrese un numero para la operacion que quiera ");
        int op;
        op = operacion.nextInt();
        if(op<1||op>5){
            System.out.println("La opercion no existe");
}
        if(op==1){
        Scanner suma = new Scanner(System.in);
        System.out.println("Ingrese un numero para restar:");
        int suma1;
        suma1 = suma.nextInt();
        Scanner sum = new Scanner(System.in);
        System.out.println("Ingrese otro numero para sumar:");
        int suma2;
        suma2 = sum.nextInt();
        int resultadosuma = suma1+suma2;
            System.out.println("su suma es "+resultadosuma);
        }
            
        if(op==2){
        Scanner res1 = new Scanner(System.in);
        System.out.println("Ingrese un numero para restar:");
        int resta1;
        resta1 = res1.nextInt();
        Scanner res2 = new Scanner(System.in);
        System.out.println("Ingrese otro numero para restar:");
        int resta2;
        resta2 = res2.nextInt();
        int resultadoresta = resta1-resta2;
            System.out.println("su resta es" +resultadoresta);
        }
        
    
           if(op==3){
        Scanner mult = new Scanner(System.in);
        System.out.println("Ingrese un numero para multiplicar:");
        int multi1;
        multi1 = mult.nextInt();
        Scanner mult2 = new Scanner(System.in);
        System.out.println("Ingrese otro numero para multiplicar:");
        int multi2;
        multi2 = mult2.nextInt();
        int resultadomulti = multi1*multi2;
            System.out.println("su multiplicacion es " +resultadomulti);
        }
        
           
           if(op==4){
        Scanner div = new Scanner(System.in);
        System.out.println("Ingrese un numero para dividir:");
        int divi1;
        divi1 = div.nextInt();
        Scanner div2 = new Scanner(System.in);
        System.out.println("Ingrese otro numero para dividir:");
        int divi2;
        divi2 = div2.nextInt();
        int resultadodivi = divi1/divi2;
            System.out.println("su division es " +resultadodivi);
        }
    
        if(op==5){
            break;
        }
    }
    }
    }
    

