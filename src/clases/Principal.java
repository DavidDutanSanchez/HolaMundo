/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author surfa
 */
public class Principal {
    public static void main(String[] args) {
        int b=1;
        while(b>=1)
        {
            System.out.print("Ingrese una edad:");
            Scanner teclado=new Scanner(System.in);
            int edad=teclado.nextInt();
            if(edad<2){System.out.println("Bebe");}
            else if(edad<12){System.out.println("Niño");}
            else if(edad<18){System.out.println("Joven");}
            else if(edad<65){System.out.println("senior");}
            else{System.out.println("Tercera edad");}
            System.out.print("ingrese el mes:");
            int a=teclado.nextInt();
            if(a==1){System.out.println("ENERO");}
            else if(a==2){System.out.println("FEBRERO");}
            else if(a==3){System.out.println("MARZO");}
            else if(a==4){System.out.println("ABRIL");}
            else if(a==5){System.out.println("MAYO");}
            else if(a==6){System.out.println("JUNIO");}
            else if(a==7){System.out.println("JULIO");}
            else if(a==8){System.out.println("AGOSTO");}
            else if(a==9){System.out.println("SEPTIEMBRE");}
            else if(a==10){System.out.println("OCTUBRE");}
            else if(a==11){System.out.println("NOVIEMBRE");}
            else if(a==12){System.out.println("DICIEMBRE");}
            else{System.out.println("mes ingresado no existe");}
        }
    }
}
